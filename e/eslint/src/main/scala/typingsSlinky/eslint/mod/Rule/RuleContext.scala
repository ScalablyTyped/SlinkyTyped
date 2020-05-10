package typingsSlinky.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.eslint.mod.Linter.ParserOptions
import typingsSlinky.eslint.mod.Scope.Scope
import typingsSlinky.eslint.mod.Scope.Variable
import typingsSlinky.eslint.mod.SourceCode
import typingsSlinky.eslint.mod.SourceCode.ParserServices
import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleContext extends js.Object {
  var id: String = js.native
  var options: js.Array[_] = js.native
  var parserOptions: ParserOptions = js.native
  var parserPath: String = js.native
  var parserServices: ParserServices = js.native
  var settings: StringDictionary[js.Any] = js.native
  def getAncestors(): js.Array[Node] = js.native
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
  def getFilename(): String = js.native
  def getScope(): Scope = js.native
  def getSourceCode(): SourceCode = js.native
  def markVariableAsUsed(name: String): Boolean = js.native
  def report(descriptor: ReportDescriptor): Unit = js.native
}

object RuleContext {
  @scala.inline
  def apply(
    getAncestors: () => js.Array[Node],
    getDeclaredVariables: Node => js.Array[Variable],
    getFilename: () => String,
    getScope: () => Scope,
    getSourceCode: () => SourceCode,
    id: String,
    markVariableAsUsed: String => Boolean,
    options: js.Array[_],
    parserOptions: ParserOptions,
    parserPath: String,
    parserServices: ParserServices,
    report: ReportDescriptor => Unit,
    settings: StringDictionary[js.Any]
  ): RuleContext = {
    val __obj = js.Dynamic.literal(getAncestors = js.Any.fromFunction0(getAncestors), getDeclaredVariables = js.Any.fromFunction1(getDeclaredVariables), getFilename = js.Any.fromFunction0(getFilename), getScope = js.Any.fromFunction0(getScope), getSourceCode = js.Any.fromFunction0(getSourceCode), id = id.asInstanceOf[js.Any], markVariableAsUsed = js.Any.fromFunction1(markVariableAsUsed), options = options.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], parserPath = parserPath.asInstanceOf[js.Any], parserServices = parserServices.asInstanceOf[js.Any], report = js.Any.fromFunction1(report), settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleContext]
  }
  @scala.inline
  implicit class RuleContextOps[Self <: RuleContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAncestors(value: () => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAncestors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDeclaredVariables(value: Node => js.Array[Variable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeclaredVariables")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFilename(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilename")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScope(value: () => Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceCode(value: () => SourceCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkVariableAsUsed(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markVariableAsUsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParserOptions(value: ParserOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParserPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParserServices(value: ParserServices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: ReportDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettings(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

