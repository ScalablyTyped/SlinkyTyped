package typingsSlinky.envCi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.envCi.mod.AppveyorEnv
  - typingsSlinky.envCi.mod.BambooEnv
  - typingsSlinky.envCi.mod.BitbucketEnv
  - typingsSlinky.envCi.mod.BitriseEnv
  - typingsSlinky.envCi.mod.BuddyEnv
  - typingsSlinky.envCi.mod.BuildkiteEnv
  - typingsSlinky.envCi.mod.CircleCiEnv
  - typingsSlinky.envCi.mod.CirrusEnv
  - typingsSlinky.envCi.mod.CodeBuildEnv
  - typingsSlinky.envCi.mod.CodefreshEnv
  - typingsSlinky.envCi.mod.CodeshipEnv
  - typingsSlinky.envCi.mod.DroneEnv
  - typingsSlinky.envCi.mod.GitLabEnv
  - typingsSlinky.envCi.mod.JenkinsEnv
  - typingsSlinky.envCi.mod.SailEnv
  - typingsSlinky.envCi.mod.SemaphoreEnv
  - typingsSlinky.envCi.mod.ShippableEnv
  - typingsSlinky.envCi.mod.TeamCityEnv
  - typingsSlinky.envCi.mod.TravisEnv
  - typingsSlinky.envCi.mod.VstsEnv
  - typingsSlinky.envCi.mod.WerckerEnv
*/
trait KnownCiEnv extends CiEnv

object KnownCiEnv {
  @scala.inline
  implicit def apply(value: AppveyorEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: BambooEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: BitbucketEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: BitriseEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: BuddyEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: BuildkiteEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: CircleCiEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: CirrusEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: CodeBuildEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: CodefreshEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: CodeshipEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: DroneEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: GitLabEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: JenkinsEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: SailEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: SemaphoreEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: ShippableEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: TeamCityEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: TravisEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: VstsEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
  @scala.inline
  implicit def apply(value: WerckerEnv): KnownCiEnv = value.asInstanceOf[KnownCiEnv]
}

