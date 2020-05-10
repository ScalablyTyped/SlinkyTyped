package typingsSlinky.apolloReact.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloClient.typesMod.MutationQueryReducersMap
import typingsSlinky.typedGraphql.mod.FragmentDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationOptions extends js.Object {
  var forceFetch: js.UndefOr[Boolean] = js.native
  var fragments: js.UndefOr[js.Array[js.Array[FragmentDefinition] | FragmentDefinition]] = js.native
  var optimisticResponse: js.UndefOr[js.Object] = js.native
  var resultBehaviors: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MutationBehavior */ _
    ]
  ] = js.native
  var updateQueries: js.UndefOr[MutationQueryReducersMap[StringDictionary[_]]] = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object MutationOptions {
  @scala.inline
  def apply(): MutationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationOptions]
  }
  @scala.inline
  implicit class MutationOptionsOps[Self <: MutationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceFetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFetch")(js.undefined)
        ret
    }
    @scala.inline
    def withFragments(value: js.Array[js.Array[FragmentDefinition] | FragmentDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragments")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticResponse(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimisticResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withResultBehaviors(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MutationBehavior */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultBehaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultBehaviors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultBehaviors")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateQueries(value: MutationQueryReducersMap[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

