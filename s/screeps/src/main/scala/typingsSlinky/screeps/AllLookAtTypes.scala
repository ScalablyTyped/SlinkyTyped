package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllLookAtTypes extends js.Object {
  var constructionSite: ConstructionSite[BuildableStructureConstant] = js.native
  var creep: Creep = js.native
  var deposit: Deposit = js.native
  var energy: Resource[RESOURCE_ENERGY] = js.native
  var exit: js.Any = js.native
   // TODO what type is this?
  var flag: Flag = js.native
  var mineral: Mineral[MineralConstant] = js.native
  var nuke: Nuke = js.native
  var powerCreep: PowerCreep = js.native
  var resource: Resource[ResourceConstant] = js.native
  var ruin: Ruin = js.native
  var source: Source = js.native
  var structure: Structure[StructureConstant] = js.native
  var terrain: Terrain = js.native
  var tombstone: Tombstone = js.native
}

object AllLookAtTypes {
  @scala.inline
  def apply(
    constructionSite: ConstructionSite[BuildableStructureConstant],
    creep: Creep,
    deposit: Deposit,
    energy: Resource[RESOURCE_ENERGY],
    exit: js.Any,
    flag: Flag,
    mineral: Mineral[MineralConstant],
    nuke: Nuke,
    powerCreep: PowerCreep,
    resource: Resource[ResourceConstant],
    ruin: Ruin,
    source: Source,
    structure: Structure[StructureConstant],
    terrain: Terrain,
    tombstone: Tombstone
  ): AllLookAtTypes = {
    val __obj = js.Dynamic.literal(constructionSite = constructionSite.asInstanceOf[js.Any], creep = creep.asInstanceOf[js.Any], deposit = deposit.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], mineral = mineral.asInstanceOf[js.Any], nuke = nuke.asInstanceOf[js.Any], powerCreep = powerCreep.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], ruin = ruin.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], terrain = terrain.asInstanceOf[js.Any], tombstone = tombstone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllLookAtTypes]
  }
  @scala.inline
  implicit class AllLookAtTypesOps[Self <: AllLookAtTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstructionSite(value: ConstructionSite[BuildableStructureConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructionSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreep(value: Creep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeposit(value: Deposit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deposit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnergy(value: Resource[RESOURCE_ENERGY]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlag(value: Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMineral(value: Mineral[MineralConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mineral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNuke(value: Nuke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nuke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerCreep(value: PowerCreep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerCreep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: Resource[ResourceConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuin(value: Ruin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructure(value: Structure[StructureConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerrain(value: Terrain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTombstone(value: Tombstone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tombstone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

