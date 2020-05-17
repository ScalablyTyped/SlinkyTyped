package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.codepipelineMod.Artifact
import typingsSlinky.awsLambda.codepipelineMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionConfiguration extends js.Object {
  var actionConfiguration: Configuration = js.native
  var artifactCredentials: Credentials = js.native
  var continuationToken: js.UndefOr[String] = js.native
  var encryptionKey: js.UndefOr[EncryptionKeytypeKMS] = js.native
  var inputArtifacts: js.Array[Artifact] = js.native
  var outputArtifacts: js.Array[Artifact] = js.native
}

object ActionConfiguration {
  @scala.inline
  def apply(
    actionConfiguration: Configuration,
    artifactCredentials: Credentials,
    inputArtifacts: js.Array[Artifact],
    outputArtifacts: js.Array[Artifact]
  ): ActionConfiguration = {
    val __obj = js.Dynamic.literal(actionConfiguration = actionConfiguration.asInstanceOf[js.Any], artifactCredentials = artifactCredentials.asInstanceOf[js.Any], inputArtifacts = inputArtifacts.asInstanceOf[js.Any], outputArtifacts = outputArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionConfiguration]
  }
  @scala.inline
  implicit class ActionConfigurationOps[Self <: ActionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionConfiguration(value: Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactCredentials(value: Credentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputArtifacts(value: js.Array[Artifact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputArtifacts(value: js.Array[Artifact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKey(value: EncryptionKeytypeKMS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(js.undefined)
        ret
    }
  }
  
}

