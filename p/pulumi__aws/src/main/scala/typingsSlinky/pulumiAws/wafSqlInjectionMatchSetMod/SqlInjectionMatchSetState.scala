package typingsSlinky.pulumiAws.wafSqlInjectionMatchSetMod

import typingsSlinky.pulumiAws.inputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlInjectionMatchTuples(value: Input[js.Array[Input[SqlInjectionMatchSetSqlInjectionMatchTuple]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlInjectionMatchTuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlInjectionMatchTuples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlInjectionMatchTuples")(js.undefined)
        ret
    }
  }
  
}

