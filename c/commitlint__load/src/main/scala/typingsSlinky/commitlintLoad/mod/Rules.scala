package typingsSlinky.commitlintLoad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rules extends js.Object {
  var `body-leading-blank`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  var `body-max-length`: js.UndefOr[Rule[Double]] = js.native
  var `body-max-line-length`: js.UndefOr[Rule[Double]] = js.native
  var `body-min-length`: js.UndefOr[Rule[Double]] = js.native
  var `footer-leading-blank`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  var `footer-max-length`: js.UndefOr[Rule[Double]] = js.native
  var `footer-max-line-length`: js.UndefOr[Rule[Double]] = js.native
  var `footer-min-length`: js.UndefOr[Rule[Double]] = js.native
  var `header-case`: js.UndefOr[Rule[Case]] = js.native
  var `header-full-stop`: js.UndefOr[Rule[String]] = js.native
  var `header-max-length`: js.UndefOr[Rule[Double]] = js.native
  var `header-min-length`: js.UndefOr[Rule[Double]] = js.native
  var `references-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  var `scope-case`: js.UndefOr[Rule[Case]] = js.native
  var `scope-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  var `scope-enum`: js.UndefOr[Rule[js.Array[String]]] = js.native
  var `scope-max-length`: js.UndefOr[Rule[Double]] = js.native
  var `scope-min-length`: js.UndefOr[Rule[Double]] = js.native
  var `signed-off-by`: js.UndefOr[Rule[String]] = js.native
  var `subject-case`: js.UndefOr[Rule[Case | js.Array[Case]]] = js.native
  var `subject-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  var `subject-full-stop`: js.UndefOr[Rule[String]] = js.native
  var `subject-max-length`: js.UndefOr[Rule[Double]] = js.native
  var `subject-min-length`: js.UndefOr[Rule[Double]] = js.native
  var `type-case`: js.UndefOr[Rule[Case]] = js.native
  var `type-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  var `type-enum`: js.UndefOr[Rule[js.Array[String]]] = js.native
  var `type-max-length`: js.UndefOr[Rule[Double]] = js.native
  var `type-min-length`: js.UndefOr[Rule[Double]] = js.native
}

object Rules {
  @scala.inline
  def apply(): Rules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rules]
  }
  @scala.inline
  implicit class RulesOps[Self <: Rules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBody-leading-blank`(value: Rule[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-leading-blank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBody-leading-blank`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-leading-blank")(js.undefined)
        ret
    }
    @scala.inline
    def `withBody-max-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-max-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBody-max-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-max-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withBody-max-line-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-max-line-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBody-max-line-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-max-line-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withBody-min-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-min-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBody-min-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-min-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withFooter-leading-blank`(value: Rule[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer-leading-blank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFooter-leading-blank`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer-leading-blank")(js.undefined)
        ret
    }
    @scala.inline
    def `withFooter-max-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer-max-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFooter-max-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer-max-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withFooter-max-line-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer-max-line-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFooter-max-line-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer-max-line-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withFooter-min-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer-min-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFooter-min-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer-min-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeader-case`(value: Rule[Case]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-case")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeader-case`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-case")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeader-full-stop`(value: Rule[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-full-stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeader-full-stop`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-full-stop")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeader-max-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-max-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeader-max-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-max-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeader-min-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-min-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeader-min-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-min-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withReferences-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references-empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutReferences-empty`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references-empty")(js.undefined)
        ret
    }
    @scala.inline
    def `withScope-case`(value: Rule[Case]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-case")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScope-case`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-case")(js.undefined)
        ret
    }
    @scala.inline
    def `withScope-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScope-empty`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-empty")(js.undefined)
        ret
    }
    @scala.inline
    def `withScope-enum`(value: Rule[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScope-enum`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-enum")(js.undefined)
        ret
    }
    @scala.inline
    def `withScope-max-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-max-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScope-max-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-max-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withScope-min-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-min-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScope-min-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope-min-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withSigned-off-by`(value: Rule[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed-off-by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSigned-off-by`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed-off-by")(js.undefined)
        ret
    }
    @scala.inline
    def `withSubject-case`(value: Rule[Case | js.Array[Case]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-case")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSubject-case`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-case")(js.undefined)
        ret
    }
    @scala.inline
    def `withSubject-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSubject-empty`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-empty")(js.undefined)
        ret
    }
    @scala.inline
    def `withSubject-full-stop`(value: Rule[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-full-stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSubject-full-stop`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-full-stop")(js.undefined)
        ret
    }
    @scala.inline
    def `withSubject-max-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-max-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSubject-max-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-max-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withSubject-min-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-min-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSubject-min-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject-min-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withType-case`(value: Rule[Case]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-case")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutType-case`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-case")(js.undefined)
        ret
    }
    @scala.inline
    def `withType-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutType-empty`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-empty")(js.undefined)
        ret
    }
    @scala.inline
    def `withType-enum`(value: Rule[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutType-enum`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-enum")(js.undefined)
        ret
    }
    @scala.inline
    def `withType-max-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-max-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutType-max-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-max-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withType-min-length`(value: Rule[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-min-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutType-min-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type-min-length")(js.undefined)
        ret
    }
  }
  
}

