package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Query

import typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the Long values to be compared in the query.
  * @param args An array of Long values.
  */
@JSGlobal("Sdk.Query.Longs")
@js.native
class Longs protected () extends ValueBase {
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
    * Specifies the Long values to be compared in the query.
    * @param setValueArgs An array of number values.
    */
  def setValues(setValueArgs: js.Array[Double]): Unit = js.native
}
