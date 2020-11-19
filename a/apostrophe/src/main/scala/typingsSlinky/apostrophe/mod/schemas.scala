package typingsSlinky.apostrophe.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apostrophe", "schemas")
@js.native
object schemas extends js.Object {
  
  def convert($el: HTMLElement, schema: Schema, data: js.Any, options: js.Any): js.Any = js.native
  def convert($el: HTMLElement, schema: Schema, data: js.Any, options: js.Any, callback: js.Function0[_]): js.Any = js.native
  
  def newInstance(schema: Schema): js.Any = js.native
  
  def populate(data: js.Any, name: String, $field: js.Any): js.Any = js.native
  def populate(
    data: js.Any,
    name: String,
    $field: js.Any,
    callback: js.UndefOr[scala.Nothing],
    $el: js.UndefOr[scala.Nothing],
    field: js.Any
  ): js.Any = js.native
  def populate(data: js.Any, name: String, $field: js.Any, callback: js.UndefOr[scala.Nothing], $el: HTMLElement): js.Any = js.native
  def populate(
    data: js.Any,
    name: String,
    $field: js.Any,
    callback: js.UndefOr[scala.Nothing],
    $el: HTMLElement,
    field: js.Any
  ): js.Any = js.native
  def populate(data: js.Any, name: String, $field: js.Any, callback: js.Function0[Unit]): js.Any = js.native
  def populate(
    data: js.Any,
    name: String,
    $field: js.Any,
    callback: js.Function0[Unit],
    $el: js.UndefOr[scala.Nothing],
    field: js.Any
  ): js.Any = js.native
  def populate(data: js.Any, name: String, $field: js.Any, callback: js.Function0[Unit], $el: HTMLElement): js.Any = js.native
  def populate(
    data: js.Any,
    name: String,
    $field: js.Any,
    callback: js.Function0[Unit],
    $el: HTMLElement,
    field: js.Any
  ): js.Any = js.native
  
  def returnToError($el: HTMLElement, schema: Schema, errorPath: js.Any, error: js.Any, callback: js.Function0[_]): Unit = js.native
}
