package typingsSlinky.makerJs.global.MakerJs

import typingsSlinky.makerJs.MakerJs.IKit
import typingsSlinky.makerJs.MakerJs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.kit")
@js.native
object kit extends js.Object {
  
  /**
    * Helper function to use the JavaScript "apply" function in conjunction with the "new" keyword.
    *
    * @param ctor The constructor for the class which is an IKit.
    * @param args The array of parameters passed to the constructor.
    * @returns A new instance of the class, which implements the IModel interface.
    */
  def construct(ctor: IKit, args: js.Any): IModel = js.native
  
  /**
    * Extract just the initial sample values from a kit.
    *
    * @param ctor The constructor for the class which is an IKit.
    * @returns Array of the inital sample values provided in the metaParameters array.
    */
  def getParameterValues(ctor: IKit): js.Array[_] = js.native
}
