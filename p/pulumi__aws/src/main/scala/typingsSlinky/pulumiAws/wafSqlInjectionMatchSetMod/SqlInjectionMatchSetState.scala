package typingsSlinky.pulumiAws.wafSqlInjectionMatchSetMod

import typingsSlinky.pulumiAws.inputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlInjectionMatchSetState extends js.Object {
  
  /**
    * The name or description of the SQL Injection Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  val sqlInjectionMatchTuples: js.UndefOr[Input[js.Array[Input[SqlInjectionMatchSetSqlInjectionMatchTuple]]]] = js.native
}
object SqlInjectionMatchSetState {
  
  @scala.inline
  def apply(): SqlInjectionMatchSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlInjectionMatchSetState]
  }
  
  @scala.inline
  implicit class SqlInjectionMatchSetStateOps[Self <: SqlInjectionMatchSetState] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSqlInjectionMatchTuplesVarargs(value: Input[SqlInjectionMatchSetSqlInjectionMatchTuple]*): Self = this.set("sqlInjectionMatchTuples", js.Array(value :_*))
    
    @scala.inline
    def setSqlInjectionMatchTuples(value: Input[js.Array[Input[SqlInjectionMatchSetSqlInjectionMatchTuple]]]): Self = this.set("sqlInjectionMatchTuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlInjectionMatchTuples: Self = this.set("sqlInjectionMatchTuples", js.undefined)
  }
}
