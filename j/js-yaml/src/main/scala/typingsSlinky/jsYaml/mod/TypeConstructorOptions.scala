package typingsSlinky.jsYaml.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsYaml.jsYamlStrings.mapping
import typingsSlinky.jsYaml.jsYamlStrings.scalar
import typingsSlinky.jsYaml.jsYamlStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeConstructorOptions extends js.Object {
  var construct: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var defaultStyle: js.UndefOr[String] = js.native
  var instanceOf: js.UndefOr[js.Object] = js.native
  var kind: js.UndefOr[sequence | scalar | mapping] = js.native
  var predicate: js.UndefOr[js.Function1[/* data */ js.Object, Boolean]] = js.native
  var represent: js.UndefOr[
    (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]])
  ] = js.native
  var resolve: js.UndefOr[js.Function1[/* data */ js.Any, Boolean]] = js.native
  var styleAliases: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object TypeConstructorOptions {
  @scala.inline
  def apply(): TypeConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeConstructorOptions]
  }
  @scala.inline
  implicit class TypeConstructorOptionsOps[Self <: TypeConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstruct(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("construct")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConstruct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("construct")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceOf(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOf")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: sequence | scalar | mapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPredicate(value: /* data */ js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.undefined)
        ret
    }
    @scala.inline
    def withRepresentFunction1(value: /* data */ js.Object => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("represent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRepresent(
      value: (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("represent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("represent")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: /* data */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleAliases(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleAliases")(js.undefined)
        ret
    }
  }
  
}

