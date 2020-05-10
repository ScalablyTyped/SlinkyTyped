package typingsSlinky.pulumiAws.repositoryPolicyMod

import typingsSlinky.pulumiAws.documentsMod.PolicyDocument
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryPolicyState extends js.Object {
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the repository to apply the policy.
    */
  val repository: js.UndefOr[Input[String]] = js.native
}

object RepositoryPolicyState {
  @scala.inline
  def apply(): RepositoryPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryPolicyState]
  }
  @scala.inline
  implicit class RepositoryPolicyStateOps[Self <: RepositoryPolicyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: Input[String | PolicyDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistryId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepository(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(js.undefined)
        ret
    }
  }
  
}

