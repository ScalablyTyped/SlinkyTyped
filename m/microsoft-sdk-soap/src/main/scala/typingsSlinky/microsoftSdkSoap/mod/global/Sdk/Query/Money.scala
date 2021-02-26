package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Query

import typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the Money values to be compared in the query.
  * @param args An array of number values.
  */
@JSGlobal("Sdk.Query.Money")
@js.native
class Money protected () extends ValueBase {
  def this(args: js.Array[Double]) = this()
  
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  
  /**
    * Returns an Sdk.Collection of number values.
    */
  def getValues(): Collection[Double] = js.native
  
  /**
    * Specifies the Money values to be compared in the query.
    * @param setValueArgs An array of number values.
    */
  def setValues(setValueArgs: js.Array[Double]): Unit = js.native
}
