package typingsSlinky.pulumiAws.capacityReservationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.instancePlatformMod.InstancePlatform
import typingsSlinky.pulumiAws.instanceTypeMod.InstanceType
import typingsSlinky.pulumiAws.tenancyMod.Tenancy
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationState extends js.Object {
  /**
    * The Availability Zone in which to create the Capacity Reservation.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether the Capacity Reservation supports EBS-optimized instances.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
    */
  val endDate: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
    */
  val endDateType: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
    */
  val ephemeralStorage: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The number of instances for which to reserve capacity.
    */
  val instanceCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
    */
  val instanceMatchCriteria: js.UndefOr[Input[String]] = js.native
  /**
    * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
    */
  val instancePlatform: js.UndefOr[Input[InstancePlatform]] = js.native
  /**
    * The instance type for which to reserve capacity.
    */
  val instanceType: js.UndefOr[Input[InstanceType]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
    */
  val tenancy: js.UndefOr[Input[Tenancy]] = js.native
}

object CapacityReservationState {
  @scala.inline
  def apply(): CapacityReservationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationState]
  }
  @scala.inline
  implicit class CapacityReservationStateOps[Self <: CapacityReservationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateType")(js.undefined)
        ret
    }
    @scala.inline
    def withEphemeralStorage(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceMatchCriteria(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceMatchCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceMatchCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceMatchCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancePlatform(value: Input[InstancePlatform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancePlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: Input[InstanceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
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
    @scala.inline
    def withTenancy(value: Input[Tenancy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenancy")(js.undefined)
        ret
    }
  }
  
}

