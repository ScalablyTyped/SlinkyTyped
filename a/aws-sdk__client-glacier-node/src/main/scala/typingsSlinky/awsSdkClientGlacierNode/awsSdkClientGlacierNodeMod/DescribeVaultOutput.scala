package typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVaultOutput extends js.Object {
  /**
    * <p>The Universal Coordinated Time (UTC) date when the vault was created. This value should be a string in the ISO 8601 date format, for example <code>2012-03-20T17:03:43.221Z</code>.</p>
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * <p>The Universal Coordinated Time (UTC) date when Amazon Glacier completed the last vault inventory. This value should be a string in the ISO 8601 date format, for example <code>2012-03-20T17:03:43.221Z</code>.</p>
    */
  var LastInventoryDate: js.UndefOr[String] = js.native
  /**
    * <p>The number of archives in the vault as of the last inventory date. This field will return <code>null</code> if an inventory has not yet run on the vault, for example if you just created the vault.</p>
    */
  var NumberOfArchives: js.UndefOr[Double] = js.native
  /**
    * <p>Total size, in bytes, of the archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.</p>
    */
  var SizeInBytes: js.UndefOr[Double] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the vault.</p>
    */
  var VaultARN: js.UndefOr[String] = js.native
  /**
    * <p>The name of the vault.</p>
    */
  var VaultName: js.UndefOr[String] = js.native
}

object DescribeVaultOutput {
  @scala.inline
  def apply(): DescribeVaultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVaultOutput]
  }
  @scala.inline
  implicit class DescribeVaultOutputOps[Self <: DescribeVaultOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastInventoryDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastInventoryDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastInventoryDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastInventoryDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfArchives(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfArchives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfArchives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfArchives")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withVaultARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultARN")(js.undefined)
        ret
    }
    @scala.inline
    def withVaultName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultName")(js.undefined)
        ret
    }
  }
  
}

