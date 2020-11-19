package typingsSlinky.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("figlet", "text")
@js.native
object text extends js.Object {
  
  def apply(txt: String, cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]): Unit = js.native
  def apply(
    txt: String,
    font: Fonts_,
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def apply(
    txt: String,
    options: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  def apply(
    txt: String,
    options: Options,
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
}
