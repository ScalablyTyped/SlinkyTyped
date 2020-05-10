package typingsSlinky.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Shell environment, which is defined as the combination of a Docker
  * image specifying what is installed on the environment and a home directory
  * containing the user&#39;s data that will remain across sessions. Each user
  * has a single environment with the ID &quot;default&quot;.
  */
@js.native
trait SchemaEnvironment extends js.Object {
  /**
    * Required. Full path to the Docker image used to run this environment,
    * e.g. &quot;gcr.io/dev-con/cloud-devshell:latest&quot;.
    */
  var dockerImage: js.UndefOr[String] = js.native
  /**
    * Output only. The environment&#39;s identifier, which is always
    * &quot;default&quot;.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Full name of this resource, in the format
    * `users/{owner_email}/environments/{environment_id}`. `{owner_email}` is
    * the email address of the user to whom this environment belongs, and
    * `{environment_id}` is the identifier of this environment. For example,
    * `users/someone@example.com/environments/default`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Public keys associated with the environment. Clients can
    * connect to this environment via SSH only if they possess a private key
    * corresponding to at least one of these public keys. Keys can be added to
    * or removed from the environment using the CreatePublicKey and
    * DeletePublicKey methods.
    */
  var publicKeys: js.UndefOr[js.Array[SchemaPublicKey]] = js.native
  /**
    * Output only. Host to which clients can connect to initiate SSH sessions
    * with the environment.
    */
  var sshHost: js.UndefOr[String] = js.native
  /**
    * Output only. Port to which clients can connect to initiate SSH sessions
    * with the environment.
    */
  var sshPort: js.UndefOr[Double] = js.native
  /**
    * Output only. Username that clients should use when initiating SSH
    * sessions with the environment.
    */
  var sshUsername: js.UndefOr[String] = js.native
  /**
    * Output only. Current execution state of this environment.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaEnvironment {
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  @scala.inline
  implicit class SchemaEnvironmentOps[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDockerImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerImage")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeys(value: js.Array[SchemaPublicKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSshHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshHost")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPort")(js.undefined)
        ret
    }
    @scala.inline
    def withSshUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

