package typingsSlinky.pulumiAws.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.awsSdk.mod.S3.PresignedPost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofS3 extends js.Object {
  val ManagedUpload: TypeofManagedUpload = js.native
  val PresignedPost: Instantiable0[typingsSlinky.awsSdk.mod.S3.PresignedPost] = js.native
  val Types: this.type = js.native
}

object TypeofS3 {
  @scala.inline
  def apply(ManagedUpload: TypeofManagedUpload, PresignedPost: Instantiable0[PresignedPost], Types: TypeofS3): TypeofS3 = {
    val __obj = js.Dynamic.literal(ManagedUpload = ManagedUpload.asInstanceOf[js.Any], PresignedPost = PresignedPost.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofS3]
  }
  @scala.inline
  implicit class TypeofS3Ops[Self <: TypeofS3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagedUpload(value: TypeofManagedUpload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresignedPost(value: Instantiable0[PresignedPost]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresignedPost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: TypeofS3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

