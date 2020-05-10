package typingsSlinky.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the smallest syntactic building block of the text.
  */
@js.native
trait SchemaToken extends js.Object {
  /**
    * Dependency tree parse for this token.
    */
  var dependencyEdge: js.UndefOr[SchemaDependencyEdge] = js.native
  /**
    * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the
    * token.
    */
  var lemma: js.UndefOr[String] = js.native
  /**
    * Parts of speech tag for this token.
    */
  var partOfSpeech: js.UndefOr[SchemaPartOfSpeech] = js.native
  /**
    * The token text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.native
}

object SchemaToken {
  @scala.inline
  def apply(): SchemaToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToken]
  }
  @scala.inline
  implicit class SchemaTokenOps[Self <: SchemaToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencyEdge(value: SchemaDependencyEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencyEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withLemma(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lemma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLemma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lemma")(js.undefined)
        ret
    }
    @scala.inline
    def withPartOfSpeech(value: SchemaPartOfSpeech): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOfSpeech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartOfSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOfSpeech")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: SchemaTextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

