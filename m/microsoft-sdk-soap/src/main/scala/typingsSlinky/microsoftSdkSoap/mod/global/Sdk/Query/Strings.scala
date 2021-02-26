package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Query

import typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the String values to be compared in the query.
  * @param args An array of String values.
  */
@JSGlobal("Sdk.Query.Strings")
@js.native
class Strings protected () extends ValueBase {
  def this(args: js.Array[String]) = this()
  
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  
  /**
    * Returns an Sdk.Collection of String values.
    */
  def getValues(): Collection[String] = js.native
  
  /**
    * Specifies the String values to be compared in the query.
    * @param setValueArgs An array of String values.
    */
  def setValues(setValueArgs: js.Array[String]): Unit = js.native
}
