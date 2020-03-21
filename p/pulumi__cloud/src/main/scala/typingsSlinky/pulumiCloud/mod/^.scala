package typingsSlinky.pulumiCloud.mod

import typingsSlinky.pulumiCloud.apiMod.APIConstructor
import typingsSlinky.pulumiCloud.bucketMod.BucketConstructor
import typingsSlinky.pulumiCloud.httpServerMod.HttpServerConstructor
import typingsSlinky.pulumiCloud.serviceMod.HostPathVolumeConstructor
import typingsSlinky.pulumiCloud.serviceMod.ServiceConstructor
import typingsSlinky.pulumiCloud.serviceMod.SharedVolumeConstructor
import typingsSlinky.pulumiCloud.serviceMod.TaskConstructor
import typingsSlinky.pulumiCloud.tableMod.TableConstructor
import typingsSlinky.pulumiCloud.topicMod.TopicConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var API: APIConstructor = js.native
  var Bucket: BucketConstructor = js.native
  var HostPathVolume: HostPathVolumeConstructor = js.native
  var HttpEndpoint: APIConstructor = js.native
  var HttpServer: HttpServerConstructor = js.native
  var Service: ServiceConstructor = js.native
  var SharedVolume: SharedVolumeConstructor = js.native
  var Table: TableConstructor = js.native
  var Task: TaskConstructor = js.native
  var Topic: TopicConstructor = js.native
}

