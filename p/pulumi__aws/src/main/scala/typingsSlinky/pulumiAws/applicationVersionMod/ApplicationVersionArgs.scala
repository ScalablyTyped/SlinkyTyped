package typingsSlinky.pulumiAws.applicationVersionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.bucketMod.Bucket
import typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod.Application
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionArgs extends js.Object {
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: Input[String | Application] = js.native
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: Input[String | Bucket] = js.native
  /**
    * Short description of the Application Version.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * On delete, force an Application Version to be deleted when it may be in use
    * by multiple Elastic Beanstalk Environments.
    */
  val forceDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * S3 object that is the Application Version source bundle.
    */
  val key: Input[String] = js.native
  /**
    * A unique name for the this Application Version.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of tags for the Elastic Beanstalk Application Version.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ApplicationVersionArgs {
  @scala.inline
  def apply(application: Input[String | Application], bucket: Input[String | Bucket], key: Input[String]): ApplicationVersionArgs = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionArgs]
  }
  @scala.inline
  implicit class ApplicationVersionArgsOps[Self <: ApplicationVersionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Input[String | Application]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucket(value: Input[String | Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withForceDelete(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
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
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

