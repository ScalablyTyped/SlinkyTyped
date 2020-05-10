package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  /** The methods of this interface, in unspecified order. */
  var methods: js.UndefOr[js.Array[Method]] = js.native
  /** Included interfaces. See Mixin. */
  var mixins: js.UndefOr[js.Array[Mixin]] = js.native
  /**
    * The fully qualified name of this interface, including package name
    * followed by the interface's simple name.
    */
  var name: js.UndefOr[String] = js.native
  /** Any metadata attached to the interface. */
  var options: js.UndefOr[js.Array[Option]] = js.native
  /**
    * Source context for the protocol buffer service represented by this
    * message.
    */
  var sourceContext: js.UndefOr[SourceContext] = js.native
  /** The source syntax of the service. */
  var syntax: js.UndefOr[String] = js.native
  /**
    * A version string for this interface. If specified, must have the form
    * `major-version.minor-version`, as in `1.10`. If the minor version is
    * omitted, it defaults to zero. If the entire version field is empty, the
    * major version is derived from the package name, as outlined below. If the
    * field is not empty, the version in the package name will be verified to be
    * consistent with what is provided here.
    *
    * The versioning schema uses [semantic
    * versioning](http://semver.org) where the major version number
    * indicates a breaking change and the minor version an additive,
    * non-breaking change. Both version numbers are signals to users
    * what to expect from different versions, and should be carefully
    * chosen based on the product plan.
    *
    * The major version is also reflected in the package name of the
    * interface, which must end in `v<major-version>`, as in
    * `google.feature.v1`. For major versions 0 and 1, the suffix can
    * be omitted. Zero major versions must only be used for
    * experimental, non-GA interfaces.
    */
  var version: js.UndefOr[String] = js.native
}

object Api {
  @scala.inline
  def apply(): Api = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethods(value: js.Array[Method]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withMixins(value: js.Array[Mixin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[Option]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceContext(value: SourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(js.undefined)
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

