package typingsSlinky.pulumiAws.glueConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionArgs extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of key-value pairs used as parameters for this connection.
    */
  val connectionProperties: Input[StringDictionary[_]] = js.native
  /**
    * The type of the connection. Defaults to `JBDC`.
    */
  val connectionType: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the connection.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  val matchCriterias: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
    */
  val physicalConnectionRequirements: js.UndefOr[Input[ConnectionPhysicalConnectionRequirements]] = js.native
}

object ConnectionArgs {
  @scala.inline
  def apply(connectionProperties: Input[StringDictionary[_]]): ConnectionArgs = {
    val __obj = js.Dynamic.literal(connectionProperties = connectionProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionArgs]
  }
  @scala.inline
  implicit class ConnectionArgsOps[Self <: ConnectionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionProperties(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionType")(js.undefined)
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
    def withMatchCriterias(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCriterias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCriterias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCriterias")(js.undefined)
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
    def withPhysicalConnectionRequirements(value: Input[ConnectionPhysicalConnectionRequirements]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalConnectionRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalConnectionRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalConnectionRequirements")(js.undefined)
        ret
    }
  }
  
}

