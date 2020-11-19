package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.BabylonFileParser
import typingsSlinky.babylonjs.BABYLON.IndividualBabylonFileParser
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AbstractScene")
@js.native
abstract class AbstractScene ()
  extends typingsSlinky.babylonjs.BABYLON.AbstractScene
/* static members */
@JSGlobal("BABYLON.AbstractScene")
@js.native
object AbstractScene extends js.Object {
  
  /**
    * Adds n individual parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  def AddIndividualParser(name: String, parser: IndividualBabylonFileParser): Unit = js.native
  
  /**
    * Adds a parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  def AddParser(name: String, parser: BabylonFileParser): Unit = js.native
  
  /**
    * Gets an individual parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  def GetIndividualParser(name: String): Nullable[IndividualBabylonFileParser] = js.native
  
  /**
    * Gets a general parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  def GetParser(name: String): Nullable[BabylonFileParser] = js.native
  
  /**
    * Parser json data and populate both a scene and its associated container object
    * @param jsonData Defines the data to parse
    * @param scene Defines the scene to parse the data for
    * @param container Defines the container attached to the parsing sequence
    * @param rootUrl Defines the root url of the data
    */
  def Parse(
    jsonData: js.Any,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    container: typingsSlinky.babylonjs.BABYLON.AssetContainer,
    rootUrl: String
  ): Unit = js.native
  
  /**
    * Stores the list of available parsers in the application.
    */
  var _BabylonFileParsers: js.Any = js.native
  
  /**
    * Stores the list of available individual parsers in the application.
    */
  var _IndividualBabylonFileParsers: js.Any = js.native
}
