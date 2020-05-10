package typingsSlinky.googleAppsScript.GoogleAppsScript.HTML

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A template object for dynamically constructing HTML. For more information, see the guide to templates.
  */
@js.native
trait HtmlTemplate
  extends /* propName */ StringDictionary[js.Any] {
  def evaluate(): HtmlOutput = js.native
  def getCode(): String = js.native
  def getCodeWithComments(): String = js.native
  def getRawContent(): String = js.native
}

object HtmlTemplate {
  @scala.inline
  def apply(
    evaluate: () => HtmlOutput,
    getCode: () => String,
    getCodeWithComments: () => String,
    getRawContent: () => String
  ): HtmlTemplate = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction0(evaluate), getCode = js.Any.fromFunction0(getCode), getCodeWithComments = js.Any.fromFunction0(getCodeWithComments), getRawContent = js.Any.fromFunction0(getRawContent))
    __obj.asInstanceOf[HtmlTemplate]
  }
  @scala.inline
  implicit class HtmlTemplateOps[Self <: HtmlTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluate(value: () => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCodeWithComments(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCodeWithComments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRawContent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawContent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

