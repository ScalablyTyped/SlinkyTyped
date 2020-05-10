package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameIdPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNameIdPair extends js.Object {
  /**
    * <p>The ID associated with the repository.</p>
    */
  var repositoryId: js.UndefOr[String] = js.native
  /**
    * <p>The name associated with the repository.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}

object RepositoryNameIdPair {
  @scala.inline
  def apply(): RepositoryNameIdPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryNameIdPair]
  }
  @scala.inline
  implicit class RepositoryNameIdPairOps[Self <: RepositoryNameIdPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryId(value: String): Self = {
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
    def withRepositoryName(value: String): Self = {
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
  }
  
}

