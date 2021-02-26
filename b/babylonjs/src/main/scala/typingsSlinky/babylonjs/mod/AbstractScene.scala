package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.abstractSceneMod.BabylonFileParser
import typingsSlinky.babylonjs.abstractSceneMod.IndividualBabylonFileParser
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "AbstractScene")
@js.native
abstract class AbstractScene ()
  extends typingsSlinky.babylonjs.legacyMod.AbstractScene
/* static members */
object AbstractScene {
  
  @JSImport("babylonjs", "AbstractScene")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds n individual parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  @JSImport("babylonjs", "AbstractScene.AddIndividualParser")
  @js.native
  def AddIndividualParser(name: String, parser: IndividualBabylonFileParser): Unit = js.native
  
  /**
    * Adds a parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  @JSImport("babylonjs", "AbstractScene.AddParser")
  @js.native
  def AddParser(name: String, parser: BabylonFileParser): Unit = js.native
  
  /**
    * Gets an individual parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  @JSImport("babylonjs", "AbstractScene.GetIndividualParser")
  @js.native
  def GetIndividualParser(name: String): Nullable[IndividualBabylonFileParser] = js.native
  
  /**
    * Gets a general parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  @JSImport("babylonjs", "AbstractScene.GetParser")
  @js.native
  def GetParser(name: String): Nullable[BabylonFileParser] = js.native
  
  /**
    * Parser json data and populate both a scene and its associated container object
    * @param jsonData Defines the data to parse
    * @param scene Defines the scene to parse the data for
    * @param container Defines the container attached to the parsing sequence
    * @param rootUrl Defines the root url of the data
    */
  @JSImport("babylonjs", "AbstractScene.Parse")
  @js.native
  def Parse(
    jsonData: js.Any,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    container: typingsSlinky.babylonjs.assetContainerMod.AssetContainer,
    rootUrl: String
  ): Unit = js.native
  
  /**
    * Stores the list of available parsers in the application.
    */
  @JSImport("babylonjs", "AbstractScene._BabylonFileParsers")
  @js.native
  def _BabylonFileParsers: js.Any = js.native
  @scala.inline
  def _BabylonFileParsers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BabylonFileParsers")(x.asInstanceOf[js.Any])
  
  /**
    * Stores the list of available individual parsers in the application.
    */
  @JSImport("babylonjs", "AbstractScene._IndividualBabylonFileParsers")
  @js.native
  def _IndividualBabylonFileParsers: js.Any = js.native
  @scala.inline
  def _IndividualBabylonFileParsers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IndividualBabylonFileParsers")(x.asInstanceOf[js.Any])
}
