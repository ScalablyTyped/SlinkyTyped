package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistryKeyState extends js.Object {
  /**
    * A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security
    * HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig,
    * currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
    */
  var hive: js.UndefOr[RegistryHive] = js.native
  // Current (i.e. changed) registry key (excludes HIVE).
  var key: js.UndefOr[String] = js.native
  // Previous (i.e. before changed) registry key (excludes HIVE).
  var oldKey: js.UndefOr[String] = js.native
  // Previous (i.e. before changed) registry key value data (contents).
  var oldValueData: js.UndefOr[String] = js.native
  // Previous (i.e. before changed) registry key value name.
  var oldValueName: js.UndefOr[String] = js.native
  // Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
  var operation: js.UndefOr[RegistryOperation] = js.native
  /**
    * Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes'
    * collection).
    */
  var processId: js.UndefOr[Double] = js.native
  // Current (i.e. changed) registry key value data (contents).
  var valueData: js.UndefOr[String] = js.native
  // Current (i.e. changed) registry key value name
  var valueName: js.UndefOr[String] = js.native
  /**
    * Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK
    * REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword,
    * dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
    */
  var valueType: js.UndefOr[RegistryValueType] = js.native
}

object RegistryKeyState {
  @scala.inline
  def apply(): RegistryKeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryKeyState]
  }
  @scala.inline
  implicit class RegistryKeyStateOps[Self <: RegistryKeyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHive(value: RegistryHive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hive")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOldKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOldValueData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValueData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValueData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValueData")(js.undefined)
        ret
    }
    @scala.inline
    def withOldValueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValueName")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: RegistryOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(js.undefined)
        ret
    }
    @scala.inline
    def withValueData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueData")(js.undefined)
        ret
    }
    @scala.inline
    def withValueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueName")(js.undefined)
        ret
    }
    @scala.inline
    def withValueType(value: RegistryValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
        ret
    }
  }
  
}

