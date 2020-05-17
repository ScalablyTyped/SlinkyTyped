package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.GithubRepoAssociation
  - typingsSlinky.ionic.definitionsMod.BitbucketCloudRepoAssociation
  - typingsSlinky.ionic.definitionsMod.BitbucketServerRepoAssociation
*/
trait RepoAssociation extends js.Object

object RepoAssociation {
  @scala.inline
  implicit def apply(value: BitbucketCloudRepoAssociation): RepoAssociation = value.asInstanceOf[RepoAssociation]
  @scala.inline
  implicit def apply(value: BitbucketServerRepoAssociation): RepoAssociation = value.asInstanceOf[RepoAssociation]
  @scala.inline
  implicit def apply(value: GithubRepoAssociation): RepoAssociation = value.asInstanceOf[RepoAssociation]
}

