package typingsSlinky.pulumiAws.repositoryMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryState extends js.Object {
  /**
    * The ARN of the repository
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  val cloneUrlHttp: js.UndefOr[Input[String]] = js.native
  /**
    * The URL to use for cloning the repository over SSH.
    */
  val cloneUrlSsh: js.UndefOr[Input[String]] = js.native
  /**
    * The default branch of the repository. The branch specified here needs to exist.
    */
  val defaultBranch: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the repository. This needs to be less than 1000 characters
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the repository
    */
  val repositoryId: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RepositoryState {
  @scala.inline
  def apply(): RepositoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryState]
  }
  @scala.inline
  implicit class RepositoryStateOps[Self <: RepositoryState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneUrlHttp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneUrlHttp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneUrlHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneUrlHttp")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneUrlSsh(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneUrlSsh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneUrlSsh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneUrlSsh")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultBranch(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBranch")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

