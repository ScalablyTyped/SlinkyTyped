package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BNFDef...
  */
@js.native
trait IBNFDef extends js.Object {
  /**
    * If set to true, it means that the definition is related to an aggregation function.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qAggrFunc: js.UndefOr[Boolean] = js.native
  /**
    * Array of token references that all together build up the definition of the current token.
    * If the array is not empty, it means that the definition is a BNF rule (qIsBnfRule is set to true).
    * There are a few exceptions where some BNF rules have an empty array (qBnf is empty).
    */
  var qBnf: js.Array[Double] = js.native
  /**
    * If set to true, it means that the definition specifies a literal token.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qBnfLiteral: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it means that the definition specifies a control statement.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qControlStatement: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if a script statement, a chart or a script function is deprecated (not recommended to use).
    * If set to true, it means that the script statement or the function is not recommended for use in Qlik Sense.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qDepr: js.UndefOr[Boolean] = js.native
  /**
    * Group of the function.
    */
  var qFG: FunctionGroupType = js.native
  /**
    * If set to true, it means that the definition is related to a field.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qFieldFlag: js.UndefOr[Boolean] = js.native
  /**
    * Reference identifier to a function described in the documentation.
    * The identifier is stored in the definition of the token containing the function name.
    * Is not used in Qlik Sense.
    */
  var qHelpId: Double = js.native
  /**
    * If set to true, it means that a list of related rule tokens is assigned to qBnf.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qIsBnfRule: js.UndefOr[Boolean] = js.native
  /**
    * Type of the data.
    */
  var qMT: MTType = js.native
  /**
    * Token name.
    * One of:
    *               a rule name
    *               an identifier
    *               a literal value
    */
  var qName: String = js.native
  /**
    * Number of the current token definition.
    */
  var qNbr: Double = js.native
  /**
    * Number of the parent rule definition.	Integer
    */
  var qPNbr: Double = js.native
  /**
    * If set to true, it means that the definition is related to a Qlik Sense function.
    * It cannot be an aggregation function.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qQvFunc: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it means that the definition specifies a script statement.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qScriptStatement: js.UndefOr[Boolean] = js.native
  /**
    * Literal string of the token.
    * Examples: 'Round' and '('.
    */
  var qStr: String = js.native
}

object IBNFDef {
  @scala.inline
  def apply(
    qBnf: js.Array[Double],
    qFG: FunctionGroupType,
    qHelpId: Double,
    qMT: MTType,
    qName: String,
    qNbr: Double,
    qPNbr: Double,
    qStr: String
  ): IBNFDef = {
    val __obj = js.Dynamic.literal(qBnf = qBnf.asInstanceOf[js.Any], qFG = qFG.asInstanceOf[js.Any], qHelpId = qHelpId.asInstanceOf[js.Any], qMT = qMT.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNbr = qNbr.asInstanceOf[js.Any], qPNbr = qPNbr.asInstanceOf[js.Any], qStr = qStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBNFDef]
  }
  @scala.inline
  implicit class IBNFDefOps[Self <: IBNFDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQBnf(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBnf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFG(value: FunctionGroupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHelpId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHelpId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMT(value: MTType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNbr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNbr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPNbr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPNbr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAggrFunc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAggrFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAggrFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAggrFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withQBnfLiteral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBnfLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQBnfLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBnfLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withQControlStatement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qControlStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQControlStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qControlStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withQDepr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDepr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQDepr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDepr")(js.undefined)
        ret
    }
    @scala.inline
    def withQFieldFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQFieldFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldFlag")(js.undefined)
        ret
    }
    @scala.inline
    def withQIsBnfRule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsBnfRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsBnfRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsBnfRule")(js.undefined)
        ret
    }
    @scala.inline
    def withQQvFunc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qQvFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQQvFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qQvFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withQScriptStatement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qScriptStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQScriptStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qScriptStatement")(js.undefined)
        ret
    }
  }
  
}

