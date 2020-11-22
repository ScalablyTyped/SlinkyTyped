package typingsSlinky.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/issue-parser/
@js.native
trait IssueParser extends js.Object {
  
  def clear(): Unit = js.native
  
  val issues: js.Array[Issue] = js.native
  
  def pushLine(line: String): Unit = js.native
}
object IssueParser {
  
  @scala.inline
  def apply(clear: () => Unit, issues: js.Array[Issue], pushLine: String => Unit): IssueParser = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), issues = issues.asInstanceOf[js.Any], pushLine = js.Any.fromFunction1(pushLine))
    __obj.asInstanceOf[IssueParser]
  }
  
  @scala.inline
  implicit class IssueParserOps[Self <: IssueParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = this.set("issues", js.Array(value :_*))
    
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = this.set("issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushLine(value: String => Unit): Self = this.set("pushLine", js.Any.fromFunction1(value))
  }
}
