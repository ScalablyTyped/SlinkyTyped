package typingsSlinky.antd.formListMod

import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormListOperation extends js.Object {
  
  def add(): Unit = js.native
  def add(defaultValue: StoreValue): Unit = js.native
  
  def move(from: Double, to: Double): Unit = js.native
  
  def remove(index: js.Array[Double]): Unit = js.native
  def remove(index: Double): Unit = js.native
}
