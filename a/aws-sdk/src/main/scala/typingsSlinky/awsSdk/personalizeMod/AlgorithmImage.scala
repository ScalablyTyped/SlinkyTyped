package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmImage extends js.Object {
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var dockerURI: DockerURI = js.native
  /**
    * The name of the algorithm image.
    */
  var name: js.UndefOr[Name] = js.native
}

object AlgorithmImage {
  @scala.inline
  def apply(dockerURI: DockerURI): AlgorithmImage = {
    val __obj = js.Dynamic.literal(dockerURI = dockerURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmImage]
  }
  @scala.inline
  implicit class AlgorithmImageOps[Self <: AlgorithmImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDockerURI(value: DockerURI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
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
  }
  
}

