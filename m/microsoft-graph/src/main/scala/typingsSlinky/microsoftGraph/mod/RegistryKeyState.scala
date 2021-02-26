package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistryKeyState extends StObject {
  
  /**
    * A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security
    * HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig,
    * currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
    */
  var hive: js.UndefOr[NullableOption[RegistryHive]] = js.native
  
  // Current (i.e. changed) registry key (excludes HIVE).
  var key: js.UndefOr[NullableOption[String]] = js.native
  
  // Previous (i.e. before changed) registry key (excludes HIVE).
  var oldKey: js.UndefOr[NullableOption[String]] = js.native
  
  // Previous (i.e. before changed) registry key value data (contents).
  var oldValueData: js.UndefOr[NullableOption[String]] = js.native
  
  // Previous (i.e. before changed) registry key value name.
  var oldValueName: js.UndefOr[NullableOption[String]] = js.native
  
  // Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
  var operation: js.UndefOr[NullableOption[RegistryOperation]] = js.native
  
  /**
    * Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes'
    * collection).
    */
  var processId: js.UndefOr[NullableOption[Double]] = js.native
  
  // Current (i.e. changed) registry key value data (contents).
  var valueData: js.UndefOr[NullableOption[String]] = js.native
  
  // Current (i.e. changed) registry key value name
  var valueName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK
    * REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword,
    * dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
    */
  var valueType: js.UndefOr[NullableOption[RegistryValueType]] = js.native
}
object RegistryKeyState {
  
  @scala.inline
  def apply(): RegistryKeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryKeyState]
  }
  
  @scala.inline
  implicit class RegistryKeyStateMutableBuilder[Self <: RegistryKeyState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHive(value: NullableOption[RegistryHive]): Self = StObject.set(x, "hive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiveNull: Self = StObject.set(x, "hive", null)
    
    @scala.inline
    def setHiveUndefined: Self = StObject.set(x, "hive", js.undefined)
    
    @scala.inline
    def setKey(value: NullableOption[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOldKey(value: NullableOption[String]): Self = StObject.set(x, "oldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldKeyNull: Self = StObject.set(x, "oldKey", null)
    
    @scala.inline
    def setOldKeyUndefined: Self = StObject.set(x, "oldKey", js.undefined)
    
    @scala.inline
    def setOldValueData(value: NullableOption[String]): Self = StObject.set(x, "oldValueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueDataNull: Self = StObject.set(x, "oldValueData", null)
    
    @scala.inline
    def setOldValueDataUndefined: Self = StObject.set(x, "oldValueData", js.undefined)
    
    @scala.inline
    def setOldValueName(value: NullableOption[String]): Self = StObject.set(x, "oldValueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueNameNull: Self = StObject.set(x, "oldValueName", null)
    
    @scala.inline
    def setOldValueNameUndefined: Self = StObject.set(x, "oldValueName", js.undefined)
    
    @scala.inline
    def setOperation(value: NullableOption[RegistryOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationNull: Self = StObject.set(x, "operation", null)
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setProcessId(value: NullableOption[Double]): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessIdNull: Self = StObject.set(x, "processId", null)
    
    @scala.inline
    def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    @scala.inline
    def setValueData(value: NullableOption[String]): Self = StObject.set(x, "valueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDataNull: Self = StObject.set(x, "valueData", null)
    
    @scala.inline
    def setValueDataUndefined: Self = StObject.set(x, "valueData", js.undefined)
    
    @scala.inline
    def setValueName(value: NullableOption[String]): Self = StObject.set(x, "valueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNameNull: Self = StObject.set(x, "valueName", null)
    
    @scala.inline
    def setValueNameUndefined: Self = StObject.set(x, "valueName", js.undefined)
    
    @scala.inline
    def setValueType(value: NullableOption[RegistryValueType]): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeNull: Self = StObject.set(x, "valueType", null)
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
