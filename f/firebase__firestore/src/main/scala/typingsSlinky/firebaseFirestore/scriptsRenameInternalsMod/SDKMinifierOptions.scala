package typingsSlinky.firebaseFirestore.scriptsRenameInternalsMod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SDKMinifierOptions extends js.Object {
  /**
    * A prefix to append to all identifiers that are not referencing the Public
    * API. Defauls to '_'.
    */
  var prefix: js.UndefOr[String] = js.native
  /** List of identifiers that are not to be minified. */
  var publicIdentifiers: Set[String] = js.native
}

object SDKMinifierOptions {
  @scala.inline
  def apply(publicIdentifiers: Set[String]): SDKMinifierOptions = {
    val __obj = js.Dynamic.literal(publicIdentifiers = publicIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDKMinifierOptions]
  }
  @scala.inline
  implicit class SDKMinifierOptionsOps[Self <: SDKMinifierOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicIdentifiers(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

