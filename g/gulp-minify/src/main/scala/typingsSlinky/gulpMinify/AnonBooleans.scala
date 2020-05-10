package typingsSlinky.gulpMinify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBooleans extends js.Object {
  /**
    * optimize boolean expressions
    */
  var booleans: js.UndefOr[Boolean] = js.native
  /**
    * try to cascade `right` into `left` in sequences
    */
  var cascade: js.UndefOr[Boolean] = js.native
  /**
    * optimize comparisons
    */
  var comparisons: js.UndefOr[Boolean] = js.native
   //
  /**
    * optimize if-s and conditional expressions
    */
  var conditionals: js.UndefOr[Boolean] = js.native
  /**
    * discard unreachable code
    */
  var dead_code: js.UndefOr[Boolean] = js.native
  /**
    * discard “debugger” statements
    */
  var drop_debugger: js.UndefOr[Boolean] = js.native
  /**
    * optimize boolean expressions
    */
  var evaluate: js.UndefOr[Boolean] = js.native
  /**
    * global definitions
    */
  var global_defs: js.UndefOr[js.Object] = js.native
  /**
    * hoist function declarations
    */
  var hoist_funs: js.UndefOr[Boolean] = js.native
  /**
    * hoist variable declarations
    */
  var hoist_vars: js.UndefOr[Boolean] = js.native
   // hoist variable declarations
  /**
    * optimize if-s followed by return/continue
    */
  var if_return: js.UndefOr[Boolean] = js.native
  /**
    * join var declarations
    */
  var join_vars: js.UndefOr[Boolean] = js.native
  /**
    * optimize loops
    */
  var loops: js.UndefOr[Boolean] = js.native
  /**
    * optimize property access?: a["foo"] → a.foo
    */
  var properties: js.UndefOr[Boolean] = js.native
  /**
    * join consecutive statemets with the “comma operator”
    */
  var sequences: js.UndefOr[Boolean] = js.native
  /**
    * drop side-effect-free statements
    */
  var side_effects: js.UndefOr[Boolean] = js.native
  /**
    * some unsafe optimizations (see below)
    */
  var unsafe: js.UndefOr[Boolean] = js.native
  /**
    * drop unused variables/functions
    */
  var unused: js.UndefOr[Boolean] = js.native
  /**
    * warn about potentially dangerous optimizations/code
    */
  var warnings: js.UndefOr[Boolean] = js.native
}

object AnonBooleans {
  @scala.inline
  def apply(): AnonBooleans = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBooleans]
  }
  @scala.inline
  implicit class AnonBooleansOps[Self <: AnonBooleans] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleans(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleans")(js.undefined)
        ret
    }
    @scala.inline
    def withCascade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(js.undefined)
        ret
    }
    @scala.inline
    def withComparisons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisons")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionals")(js.undefined)
        ret
    }
    @scala.inline
    def withDead_code(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dead_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDead_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dead_code")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop_debugger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_debugger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop_debugger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_debugger")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal_defs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global_defs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal_defs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global_defs")(js.undefined)
        ret
    }
    @scala.inline
    def withHoist_funs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_funs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoist_funs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_funs")(js.undefined)
        ret
    }
    @scala.inline
    def withHoist_vars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoist_vars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoist_vars")(js.undefined)
        ret
    }
    @scala.inline
    def withIf_return(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if_return")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIf_return: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if_return")(js.undefined)
        ret
    }
    @scala.inline
    def withJoin_vars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join_vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoin_vars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join_vars")(js.undefined)
        ret
    }
    @scala.inline
    def withLoops(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loops")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withSequences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequences")(js.undefined)
        ret
    }
    @scala.inline
    def withSide_effects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side_effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide_effects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side_effects")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe")(js.undefined)
        ret
    }
    @scala.inline
    def withUnused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unused")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

