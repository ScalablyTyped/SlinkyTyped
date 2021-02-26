package typingsSlinky.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends StObject {
  
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
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: String | ContainerBuild): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setCommand(value: Input[js.Array[String]]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setCpu(value: Input[Double]): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    @scala.inline
    def setDockerLabels(value: Input[StringDictionary[String]]): Self = StObject.set(x, "dockerLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerLabelsUndefined: Self = StObject.set(x, "dockerLabels", js.undefined)
    
    @scala.inline
    def setEnvironment(value: StringDictionary[Input[String]]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setFunction(value: () => Unit): Self = StObject.set(x, "function", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    @scala.inline
    def setImage(value: Input[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setMemory(value: Input[Double]): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservation(value: Input[Double]): Self = StObject.set(x, "memoryReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservationUndefined: Self = StObject.set(x, "memoryReservation", js.undefined)
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[ContainerPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: ContainerPort*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[ContainerVolumeMount]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: ContainerVolumeMount*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}
