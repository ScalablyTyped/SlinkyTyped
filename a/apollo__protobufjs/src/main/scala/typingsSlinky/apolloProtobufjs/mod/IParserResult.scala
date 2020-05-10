package typingsSlinky.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParserResult extends js.Object {
  /** Package name, if declared */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  /** Imports, if any */
  var imports: js.UndefOr[js.Array[String]] = js.native
  /** Populated root instance */
  var root: Root = js.native
  /** Syntax, if specified (either `"proto2"` or `"proto3"`) */
  var syntax: js.UndefOr[String] = js.native
  /** Weak imports, if any */
  var weakImports: js.UndefOr[js.Array[String]] = js.native
}

object IParserResult {
  @scala.inline
  def apply(root: Root): IParserResult = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParserResult]
  }
  @scala.inline
  implicit class IParserResultOps[Self <: IParserResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: Root): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def withImports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(js.undefined)
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
    def withWeakImports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weakImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeakImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weakImports")(js.undefined)
        ret
    }
  }
  
}

