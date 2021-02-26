package typingsSlinky.envCi.mod

import typingsSlinky.envCi.envCiBooleans.`true`
import typingsSlinky.envCi.envCiStrings.Appveyor
import typingsSlinky.envCi.envCiStrings.Bamboo
import typingsSlinky.envCi.envCiStrings.Bitrise
import typingsSlinky.envCi.envCiStrings.Buddy
import typingsSlinky.envCi.envCiStrings.Buildkite
import typingsSlinky.envCi.envCiStrings.CircleCI
import typingsSlinky.envCi.envCiStrings.Codefresh
import typingsSlinky.envCi.envCiStrings.Codeship
import typingsSlinky.envCi.envCiStrings.Drone
import typingsSlinky.envCi.envCiStrings.Jenkins
import typingsSlinky.envCi.envCiStrings.Semaphore
import typingsSlinky.envCi.envCiStrings.Shippable
import typingsSlinky.envCi.envCiStrings.TeamCity
import typingsSlinky.envCi.envCiStrings.Wercker
import typingsSlinky.envCi.envCiStrings.`AWS CodeBuild`
import typingsSlinky.envCi.envCiStrings.`Bitbucket Pipelines`
import typingsSlinky.envCi.envCiStrings.`Cirrus CI`
import typingsSlinky.envCi.envCiStrings.`GitLab CISlashCD`
import typingsSlinky.envCi.envCiStrings.`Sail CI`
import typingsSlinky.envCi.envCiStrings.`Travis CI`
import typingsSlinky.envCi.envCiStrings.`Visual Studio Team Services`
import typingsSlinky.envCi.envCiStrings.appveyor_
import typingsSlinky.envCi.envCiStrings.bamboo_
import typingsSlinky.envCi.envCiStrings.bitbucket
import typingsSlinky.envCi.envCiStrings.bitrise_
import typingsSlinky.envCi.envCiStrings.buddy_
import typingsSlinky.envCi.envCiStrings.buildkite_
import typingsSlinky.envCi.envCiStrings.circleci_
import typingsSlinky.envCi.envCiStrings.cirrus
import typingsSlinky.envCi.envCiStrings.codebuild
import typingsSlinky.envCi.envCiStrings.codefresh_
import typingsSlinky.envCi.envCiStrings.codeship_
import typingsSlinky.envCi.envCiStrings.drone_
import typingsSlinky.envCi.envCiStrings.gitlab
import typingsSlinky.envCi.envCiStrings.jenkins_
import typingsSlinky.envCi.envCiStrings.sail
import typingsSlinky.envCi.envCiStrings.semaphore_
import typingsSlinky.envCi.envCiStrings.shippable_
import typingsSlinky.envCi.envCiStrings.teamcity_
import typingsSlinky.envCi.envCiStrings.travis
import typingsSlinky.envCi.envCiStrings.vsts
import typingsSlinky.envCi.envCiStrings.wercker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def AppveyorEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    name: Appveyor,
    root: String,
    service: appveyor_,
    slug: String
  ): typingsSlinky.envCi.mod.AppveyorEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.AppveyorEnv]
  }
  
  @scala.inline
  def BambooEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    job: String,
    name: Bamboo,
    root: String,
    service: bamboo_
  ): typingsSlinky.envCi.mod.BambooEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.BambooEnv]
  }
  
  @scala.inline
  def BitbucketEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: `Bitbucket Pipelines`,
    root: String,
    service: bitbucket,
    slug: String
  ): typingsSlinky.envCi.mod.BitbucketEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.BitbucketEnv]
  }
  
  @scala.inline
  def BitriseEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Bitrise,
    service: bitrise_,
    slug: String
  ): typingsSlinky.envCi.mod.BitriseEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.BitriseEnv]
  }
  
  @scala.inline
  def BuddyEnv(
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Buddy,
    service: buddy_,
    slug: String
  ): typingsSlinky.envCi.mod.BuddyEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.BuddyEnv]
  }
  
  @scala.inline
  def BuildkiteEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Buildkite,
    root: String,
    service: buildkite_,
    slug: String
  ): typingsSlinky.envCi.mod.BuildkiteEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.BuildkiteEnv]
  }
  
  @scala.inline
  def CircleCiEnv(
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    name: CircleCI,
    service: circleci_,
    slug: String
  ): typingsSlinky.envCi.mod.CircleCiEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.CircleCiEnv]
  }
  
  @scala.inline
  def CirrusEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    name: `Cirrus CI`,
    root: String,
    service: cirrus,
    slug: String
  ): typingsSlinky.envCi.mod.CirrusEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.CirrusEnv]
  }
  
  @scala.inline
  def CodeBuildEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: `AWS CodeBuild`,
    root: String,
    service: codebuild
  ): typingsSlinky.envCi.mod.CodeBuildEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.CodeBuildEnv]
  }
  
  @scala.inline
  def CodefreshEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Codefresh,
    root: String,
    service: codefresh_,
    slug: String
  ): typingsSlinky.envCi.mod.CodefreshEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.CodefreshEnv]
  }
  
  @scala.inline
  def CodeshipEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: Codeship,
    service: codeship_,
    slug: String
  ): typingsSlinky.envCi.mod.CodeshipEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.CodeshipEnv]
  }
  
  @scala.inline
  def DroneEnv(
    branch: String,
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    name: Drone,
    service: drone_,
    slug: String
  ): typingsSlinky.envCi.mod.DroneEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.DroneEnv]
  }
  
  @scala.inline
  def GitLabEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    job: String,
    jobUrl: String,
    name: `GitLab CISlashCD`,
    root: String,
    service: gitlab,
    slug: String
  ): typingsSlinky.envCi.mod.GitLabEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.GitLabEnv]
  }
  
  @scala.inline
  def JenkinsEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Jenkins,
    root: String,
    service: jenkins_
  ): typingsSlinky.envCi.mod.JenkinsEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.JenkinsEnv]
  }
  
  @scala.inline
  def SailEnv(
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: `Sail CI`,
    root: String,
    service: sail,
    slug: String
  ): typingsSlinky.envCi.mod.SailEnv = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.SailEnv]
  }
  
  @scala.inline
  def SemaphoreEnv(
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Semaphore,
    root: String,
    service: semaphore_,
    slug: String
  ): typingsSlinky.envCi.mod.SemaphoreEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.SemaphoreEnv]
  }
  
  @scala.inline
  def ShippableEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    name: Shippable,
    root: String,
    service: shippable_,
    slug: String
  ): typingsSlinky.envCi.mod.ShippableEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.ShippableEnv]
  }
  
  @scala.inline
  def TeamCityEnv(build: String, commit: String, isCi: `true`, name: TeamCity, service: teamcity_, slug: String): typingsSlinky.envCi.mod.TeamCityEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.TeamCityEnv]
  }
  
  @scala.inline
  def TravisEnv(
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    name: `Travis CI`,
    prBranch: String,
    root: String,
    service: travis,
    slug: String
  ): typingsSlinky.envCi.mod.TravisEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prBranch = prBranch.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.TravisEnv]
  }
  
  @scala.inline
  def VstsEnv(
    branch: String,
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: `Visual Studio Team Services`,
    root: String,
    service: vsts
  ): typingsSlinky.envCi.mod.VstsEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.VstsEnv]
  }
  
  @scala.inline
  def WerckerEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: Wercker,
    root: String,
    service: wercker_,
    slug: String
  ): typingsSlinky.envCi.mod.WerckerEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.envCi.mod.WerckerEnv]
  }
}
