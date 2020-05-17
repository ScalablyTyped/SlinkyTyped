package typingsSlinky.ckeditor.CKEDITOR.plugins.indent

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.elementPath
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.anon.Exec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait specificDefinition extends js.Object {
  var database: StringDictionary[js.Any] = js.native
  val enterBr: Boolean = js.native
  val indentKey: StringDictionary[js.Any] = js.native
  val isIndent: Boolean = js.native
  val jobs: StringDictionary[Exec] = js.native
  val relatedGlobal: StringDictionary[js.Any] = js.native
  def execJob(editor: editor, priority: Double): Boolean = js.native
  def getContext(node: elementPath): element = js.native
  def refreshJob(editor: editor, priority: Double): Double = js.native
}

object specificDefinition {
  @scala.inline
  def apply(
    database: StringDictionary[js.Any],
    enterBr: Boolean,
    execJob: (editor, Double) => Boolean,
    getContext: elementPath => element,
    indentKey: StringDictionary[js.Any],
    isIndent: Boolean,
    jobs: StringDictionary[Exec],
    refreshJob: (editor, Double) => Double,
    relatedGlobal: StringDictionary[js.Any]
  ): specificDefinition = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], enterBr = enterBr.asInstanceOf[js.Any], execJob = js.Any.fromFunction2(execJob), getContext = js.Any.fromFunction1(getContext), indentKey = indentKey.asInstanceOf[js.Any], isIndent = isIndent.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], refreshJob = js.Any.fromFunction2(refreshJob), relatedGlobal = relatedGlobal.asInstanceOf[js.Any])
    __obj.asInstanceOf[specificDefinition]
  }
  @scala.inline
  implicit class specificDefinitionOps[Self <: specificDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterBr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterBr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecJob(value: (editor, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execJob")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetContext(value: elementPath => element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndentKey(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobs(value: StringDictionary[Exec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshJob(value: (editor, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshJob")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRelatedGlobal(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedGlobal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

