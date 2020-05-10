package typingsSlinky.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  /**
    * Either a path to a folder in which a Docker build should be run to construct the image for this
    * Container, or a ContainerBuild object with more detailed build instructions.  If `image` is also specified, the
    * built container will be tagged with that name, but otherwise will get an auto-generated image name.
    */
  var build: js.UndefOr[String | ContainerBuild] = js.native
  /**
    * The command line that is passed to the container. This parameter maps to
    * `Cmd` in the [Create a
    * container](https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/#create-a-container)
    * section of the [Docker Remote
    * API](https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/)
    * and the `COMMAND` parameter to [docker run](https://docs.docker.com/engine/reference/commandline/run/). For more
    * information about the Docker `CMD` parameter, go to
    * https://docs.docker.com/engine/reference/builder/#cmd.
    */
  var command: js.UndefOr[Input[js.Array[String]]] = js.native
  /**
    * Number of CPUs for the container to use. Maps to the Docker `--cpus` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    */
  var cpu: js.UndefOr[Input[Double]] = js.native
  /**
    * A key/value map of labels to add to the container. This parameter maps to Labels in the [Create a
    * container](https://docs.docker.com/engine/api/v1.27/#operation/ContainerCreate) section of the [Docker Remote
    * API](https://docs.docker.com/engine/api/v1.27/) and the --label option to [docker
    * run](https://docs.docker.com/engine/reference/run/).
    */
  var dockerLabels: js.UndefOr[Input[StringDictionary[String]]] = js.native
  /**
    * Optional environment variables to set and make available to the container
    * as it is running.
    */
  var environment: js.UndefOr[StringDictionary[Input[String]]] = js.native
  /**
    * The function code to use as the implementation of the contaner.  If `function` is specified,
    * neither `image` nor `build` are legal.
    */
  var function: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The image to use for the container.  If `image` is specified, but not `build`, the image will be
    * pulled from the Docker Hub.  If `image` *and* `build` are specified, the `image` controls the
    * resulting image tag for the build image that gets pushed.
    */
  var image: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum amount of memory the container will be allowed to use. Maps to the Docker
    * `--memory` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    *
    * This should be supplied in MB. i.e. A value of 1024 would equal one gigabyte.
    */
  var memory: js.UndefOr[Input[Double]] = js.native
  /**
    * The amount of memory to reserve for the container, but the container will
    * be allowed to use more memory if it's available.  At least one of
    * `memory` and `memoryReservation` must be specified.  Maps to the Docker
    * `--memory-reservation` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    *
    * This should be supplied in MB. i.e. A value of 1024 would equal one gigabyte.
    */
  var memoryReservation: js.UndefOr[Input[Double]] = js.native
  /**
    * An array of ports to publish from the container.  Ports are exposed using the TCP protocol.  If the [external]
    * flag is true, the port will be exposed to the Internet even if the service is running in a private network.
    * Maps to the Docker `--publish` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    */
  var ports: js.UndefOr[js.Array[ContainerPort]] = js.native
  /**
    * An array of volume mounts, indicating a volume to mount and a path within
    * the container at which to mount the volume.  Maps to the Docker
    * `--volume` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    */
  var volumes: js.UndefOr[js.Array[ContainerVolumeMount]] = js.native
}

object Container {
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: String | ContainerBuild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withCommand(value: Input[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withCpu(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(js.undefined)
        ret
    }
    @scala.inline
    def withDockerLabels(value: Input[StringDictionary[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: StringDictionary[Input[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withFunction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryReservation(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryReservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryReservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryReservation")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: js.Array[ContainerPort]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: js.Array[ContainerVolumeMount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
  }
  
}

