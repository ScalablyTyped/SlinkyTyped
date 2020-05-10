package typingsSlinky.pulumiAws.getContainerDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContainerDefinitionResult extends js.Object {
  val containerName: String = js.native
  /**
    * The CPU limit for this container definition
    */
  val cpu: Double = js.native
  /**
    * Indicator if networking is disabled
    */
  val disableNetworking: Boolean = js.native
  /**
    * Set docker labels
    */
  val dockerLabels: StringDictionary[String] = js.native
  /**
    * The environment in use
    */
  val environment: StringDictionary[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The docker image in use, including the digest
    */
  val image: String = js.native
  /**
    * The digest of the docker image in use
    */
  val imageDigest: String = js.native
  /**
    * The memory limit for this container definition
    */
  val memory: Double = js.native
  /**
    * The soft limit (in MiB) of memory to reserve for the container. When system memory is under contention, Docker attempts to keep the container memory to this soft limit
    */
  val memoryReservation: Double = js.native
  val taskDefinition: String = js.native
}

object GetContainerDefinitionResult {
  @scala.inline
  def apply(
    containerName: String,
    cpu: Double,
    disableNetworking: Boolean,
    dockerLabels: StringDictionary[String],
    environment: StringDictionary[String],
    id: String,
    image: String,
    imageDigest: String,
    memory: Double,
    memoryReservation: Double,
    taskDefinition: String
  ): GetContainerDefinitionResult = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], disableNetworking = disableNetworking.asInstanceOf[js.Any], dockerLabels = dockerLabels.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageDigest = imageDigest.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryReservation = memoryReservation.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerDefinitionResult]
  }
  @scala.inline
  implicit class GetContainerDefinitionResultOps[Self <: GetContainerDefinitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableNetworking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNetworking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDockerLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoryReservation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryReservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefinition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

