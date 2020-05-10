package typingsSlinky.js2xmlparser.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeclarationOptions extends js.Object {
  /**
    * The encoding attribute to be included in the declaration. If defined,
    * this value must be a valid encoding. By default, no encoding attribute
    * is included.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Whether to include a declaration in the generated XML. By default,
    * one is included.
    */
  var include: js.UndefOr[Boolean] = js.native
  /**
    * The value of the standalone attribute to be included in the declaration.
    * If defined, this value must be "yes" or "no". By default, no standalone
    * attribute is included.
    */
  var standalone: js.UndefOr[String] = js.native
  /**
    * The XML version to be included in the declaration. If defined, this
    * value must be a valid XML version number. Defaults to "1.0".
    */
  var version: js.UndefOr[String] = js.native
}

object IDeclarationOptions {
  @scala.inline
  def apply(): IDeclarationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeclarationOptions]
  }
  @scala.inline
  implicit class IDeclarationOptionsOps[Self <: IDeclarationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withStandalone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

