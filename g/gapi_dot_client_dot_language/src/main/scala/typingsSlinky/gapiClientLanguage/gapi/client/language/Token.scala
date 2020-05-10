package typingsSlinky.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  /** Dependency tree parse for this token. */
  var dependencyEdge: js.UndefOr[DependencyEdge] = js.native
  /** [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token. */
  var lemma: js.UndefOr[String] = js.native
  /** Parts of speech tag for this token. */
  var partOfSpeech: js.UndefOr[PartOfSpeech] = js.native
  /** The token text. */
  var text: js.UndefOr[TextSpan] = js.native
}

object Token {
  @scala.inline
  def apply(): Token = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencyEdge(value: DependencyEdge): Self = {
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
    def withPartOfSpeech(value: PartOfSpeech): Self = {
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
    def withText(value: TextSpan): Self = {
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

