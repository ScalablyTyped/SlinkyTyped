package typingsSlinky.apolloClient.localStateMod

import typingsSlinky.apolloUtilities.getFromASTMod.FragmentMap
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecContext extends js.Object {
  var context: js.Any = js.native
  var defaultOperationType: String = js.native
  var exportedVariables: Record[String, _] = js.native
  var fragmentMap: FragmentMap = js.native
  var fragmentMatcher: FragmentMatcher = js.native
  var onlyRunForcedResolvers: Boolean = js.native
  var variables: VariableMap = js.native
}

object ExecContext {
  @scala.inline
  def apply(
    context: js.Any,
    defaultOperationType: String,
    exportedVariables: Record[String, _],
    fragmentMap: FragmentMap,
    fragmentMatcher: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => Boolean,
    onlyRunForcedResolvers: Boolean,
    variables: VariableMap
  ): ExecContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], defaultOperationType = defaultOperationType.asInstanceOf[js.Any], exportedVariables = exportedVariables.asInstanceOf[js.Any], fragmentMap = fragmentMap.asInstanceOf[js.Any], fragmentMatcher = js.Any.fromFunction3(fragmentMatcher), onlyRunForcedResolvers = onlyRunForcedResolvers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecContext]
  }
  @scala.inline
  implicit class ExecContextOps[Self <: ExecContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOperationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOperationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportedVariables(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportedVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentMap(value: FragmentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentMatcher(value: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentMatcher")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnlyRunForcedResolvers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyRunForcedResolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: VariableMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

