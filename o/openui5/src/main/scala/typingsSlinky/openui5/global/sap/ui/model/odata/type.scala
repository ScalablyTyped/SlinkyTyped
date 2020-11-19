package typingsSlinky.openui5.global.sap.ui.model.odata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.odata.type")
@js.native
object `type` extends js.Object {
  
  @js.native
  class Boolean protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Boolean {
    /**
      * Constructor for an OData primitive type <code>Edm.Boolean</code>.
      * @param oFormatOptions format options as defined in the interface of {@link sap.ui.model.SimpleType};
      * this  type ignores them since it does not support any format options
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Byte protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Byte {
    /**
      * Constructor for a primitive type <code>Edm.Byte</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue}
      * throws an  error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Date protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Date {
    /**
      * Constructor for an OData primitive type <code>Edm.Date</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class DateTime protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.DateTime {
    /**
      * Constructor for a primitive type <code>Edm.DateTime</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue
      * validateValue}  throws an error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  abstract class DateTimeBase protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.DateTimeBase {
    /**
      * Base constructor for the primitive types <code>Edm.DateTime</code>
      * and<code>Edm.DateTimeOffset</code>.
      * @param oFormatOptions Type-specific format options; see subtypes
      * @param oConstraints Constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class DateTimeOffset protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.DateTimeOffset {
    /**
      * Constructor for a primitive type <code>Edm.DateTimeOffset</code>.
      * @param oFormatOptions Format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints Constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue
      * validateValue}  throws an error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Decimal protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Decimal {
    /**
      * Constructor for a primitive type <code>Edm.Decimal</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.  Note that
      * <code>maxFractionDigits</code> and <code>minFractionDigits</code> are set to  the value of the
      * constraint <code>scale</code> unless it is "variable". They can however  be overwritten.
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Double protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Double {
    /**
      * Constructor for a primitive type <code>Edm.Double</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Guid protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Guid {
    /**
      * Constructor for an OData primitive type <code>Edm.Guid</code>.
      * @param oFormatOptions format options as defined in the interface of {@link sap.ui.model.SimpleType};
      * this  type ignores them since it does not support any format options
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Int protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Int {
    /**
      * Constructor for a new <code>Int</code>.
      * @param oFormatOptions type-specific format options; see subtypes
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Int16 protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Int16 {
    /**
      * Constructor for a primitive type <code>Edm.Int16</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue}
      * throws an  error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Int32 protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Int32 {
    /**
      * Constructor for a primitive type <code>Edm.Int32</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue}
      * throws an  error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Int64 protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Int64 {
    /**
      * Constructor for a primitive type <code>Edm.Int64</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class ODataType protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.ODataType {
    /**
      * Constructor for a new <code>ODataType</code>.
      * @param oFormatOptions type-specific format options; see subtypes
      * @param oConstraints type-specific constraints (e.g. <code>oConstraints.nullable</code>), see
      * subtypes
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Raw protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Raw {
    /**
      * Constructor for a placeholder for all unsupported OData primitive types.
      * @param oFormatOptions Must be <code>undefined</code>
      * @param oConstraints Must be <code>undefined</code>
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class SByte protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.SByte {
    /**
      * Constructor for a primitive type <code>Edm.SByte</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue}
      * throws an  error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Single protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Single {
    /**
      * Constructor for a primitive type <code>Edm.Single</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class String protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.String {
    /**
      * Constructor for an OData primitive type <code>Edm.String</code>.
      * @param oFormatOptions format options as defined in the interface of {@link sap.ui.model.SimpleType};
      * this  type ignores them since it does not support any format options
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Time protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.Time {
    /**
      * Constructor for an OData primitive type <code>Edm.Time</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class TimeOfDay protected ()
    extends typingsSlinky.openui5.sap.ui.model.odata.`type`.TimeOfDay {
    /**
      * Constructor for an OData primitive type <code>Edm.TimeOfDay</code>.
      * @param oFormatOptions Format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints Constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
}
