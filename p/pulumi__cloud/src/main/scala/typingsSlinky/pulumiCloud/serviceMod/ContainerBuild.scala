package typingsSlinky.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerBuild extends js.Object {
  /**
    * An optional map of named build-time argument variables to set during the Docker build.  This flag allows you
    * to pass built-time variables that can be accessed like environment variables inside the `RUN` instruction.
    */
  var args: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An optional CacheFrom object with information about the build stages to use for the Docker build cache.
    * This parameter maps to the --cache-from argument to the Docker CLI. If this parameter is `true`, only the final
    * image will be pulled and passed to --cache-from; if it is a CacheFrom object, the stages named therein will
    * also be pulled and passed to --cache-from.
    */
  var cacheFrom: js.UndefOr[Boolean | CacheFrom] = js.native
  /**
    * context is a path to a directory to use for the Docker build context, usually the directory in which the
    * Dockerfile resides (although dockerfile may be used to choose a custom location independent of this choice).
    * If not specified, the context defaults to the current working directory; if a relative path is used, it
    * is relative to the current working directory that Pulumi is evaluating.
    */
  var context: js.UndefOr[String] = js.native
  /**
    * dockerfile may be used to override the default Dockerfile name and/or location.  By default, it is assumed
    * to be a file named Dockerfile in the root of the build context.
    */
  var dockerfile: js.UndefOr[String] = js.native
}

object ContainerBuild {
  @scala.inline
  def apply(): ContainerBuild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerBuild]
  }
  @scala.inline
  implicit class ContainerBuildOps[Self <: ContainerBuild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheFrom(value: Boolean | CacheFrom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDockerfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerfile")(js.undefined)
        ret
    }
  }
  
}

