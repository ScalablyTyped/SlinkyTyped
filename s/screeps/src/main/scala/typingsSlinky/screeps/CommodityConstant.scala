package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The commodities, produced by the Factory */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.RESOURCE_UTRIUM_BAR
  - typingsSlinky.screeps.RESOURCE_LEMERGIUM_BAR
  - typingsSlinky.screeps.RESOURCE_ZYNTHIUM_BAR
  - typingsSlinky.screeps.RESOURCE_KEANIUM_BAR
  - typingsSlinky.screeps.RESOURCE_GHODIUM_MELT
  - typingsSlinky.screeps.RESOURCE_OXIDANT
  - typingsSlinky.screeps.RESOURCE_REDUCTANT
  - typingsSlinky.screeps.RESOURCE_PURIFIER
  - typingsSlinky.screeps.RESOURCE_BATTERY
  - typingsSlinky.screeps.RESOURCE_COMPOSITE
  - typingsSlinky.screeps.RESOURCE_CRYSTAL
  - typingsSlinky.screeps.RESOURCE_LIQUID
  - typingsSlinky.screeps.RESOURCE_WIRE
  - typingsSlinky.screeps.RESOURCE_SWITCH
  - typingsSlinky.screeps.RESOURCE_TRANSISTOR
  - typingsSlinky.screeps.RESOURCE_MICROCHIP
  - typingsSlinky.screeps.RESOURCE_CIRCUIT
  - typingsSlinky.screeps.RESOURCE_DEVICE
  - typingsSlinky.screeps.RESOURCE_CELL
  - typingsSlinky.screeps.RESOURCE_PHLEGM
  - typingsSlinky.screeps.RESOURCE_TISSUE
  - typingsSlinky.screeps.RESOURCE_MUSCLE
  - typingsSlinky.screeps.RESOURCE_ORGANOID
  - typingsSlinky.screeps.RESOURCE_ORGANISM
  - typingsSlinky.screeps.RESOURCE_ALLOY
  - typingsSlinky.screeps.RESOURCE_TUBE
  - typingsSlinky.screeps.RESOURCE_FIXTURES
  - typingsSlinky.screeps.RESOURCE_FRAME
  - typingsSlinky.screeps.RESOURCE_HYDRAULICS
  - typingsSlinky.screeps.RESOURCE_MACHINE
  - typingsSlinky.screeps.RESOURCE_CONDENSATE
  - typingsSlinky.screeps.RESOURCE_CONCENTRATE
  - typingsSlinky.screeps.RESOURCE_EXTRACT
  - typingsSlinky.screeps.RESOURCE_SPIRIT
  - typingsSlinky.screeps.RESOURCE_EMANATION
  - typingsSlinky.screeps.RESOURCE_ESSENCE
*/
trait CommodityConstant extends ResourceConstant

object CommodityConstant {
  @scala.inline
  implicit def apply(value: RESOURCE_ALLOY): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_BATTERY): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_CELL): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_CIRCUIT): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_COMPOSITE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_CONCENTRATE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_CONDENSATE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_CRYSTAL): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_DEVICE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_EMANATION): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_ESSENCE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_EXTRACT): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_FIXTURES): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_FRAME): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_GHODIUM_MELT): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_HYDRAULICS): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_KEANIUM_BAR): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_LEMERGIUM_BAR): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_LIQUID): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_MACHINE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_MICROCHIP): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_MUSCLE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_ORGANISM): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_ORGANOID): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_OXIDANT): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_PHLEGM): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_PURIFIER): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_REDUCTANT): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_SPIRIT): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_SWITCH): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_TISSUE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_TRANSISTOR): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_TUBE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_UTRIUM_BAR): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_WIRE): CommodityConstant = value.asInstanceOf[CommodityConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_ZYNTHIUM_BAR): CommodityConstant = value.asInstanceOf[CommodityConstant]
}

