package typingsSlinky.pulumiAws.inputMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object efs {
  
  @js.native
  trait AccessPointPosixUser extends StObject {
    
    /**
      * The POSIX group ID used for all file system operations using this access point.
      */
    var gid: Input[Double] = js.native
    
    /**
      * Secondary POSIX group IDs used for all file system operations using this access point.
      */
    var secondaryGids: js.UndefOr[Input[js.Array[Input[Double]]]] = js.native
    
    /**
      * The POSIX user ID used for all file system operations using this access point.
      */
    var uid: Input[Double] = js.native
  }
  object AccessPointPosixUser {
    
    @scala.inline
    def apply(gid: Input[Double], uid: Input[Double]): AccessPointPosixUser = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointPosixUser]
    }
    
    @scala.inline
    implicit class AccessPointPosixUserMutableBuilder[Self <: AccessPointPosixUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGid(value: Input[Double]): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryGids(value: Input[js.Array[Input[Double]]]): Self = StObject.set(x, "secondaryGids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryGidsUndefined: Self = StObject.set(x, "secondaryGids", js.undefined)
      
      @scala.inline
      def setSecondaryGidsVarargs(value: Input[Double]*): Self = StObject.set(x, "secondaryGids", js.Array(value :_*))
      
      @scala.inline
      def setUid(value: Input[Double]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccessPointRootDirectory extends StObject {
    
    /**
      * Specifies the POSIX IDs and permissions to apply to the access point's Root Directory. See Creation Info below.
      */
    var creationInfo: js.UndefOr[Input[AccessPointRootDirectoryCreationInfo]] = js.native
    
    /**
      * Specifies the path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide `creationInfo`.
      */
    var path: js.UndefOr[Input[String]] = js.native
  }
  object AccessPointRootDirectory {
    
    @scala.inline
    def apply(): AccessPointRootDirectory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessPointRootDirectory]
    }
    
    @scala.inline
    implicit class AccessPointRootDirectoryMutableBuilder[Self <: AccessPointRootDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationInfo(value: Input[AccessPointRootDirectoryCreationInfo]): Self = StObject.set(x, "creationInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationInfoUndefined: Self = StObject.set(x, "creationInfo", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait AccessPointRootDirectoryCreationInfo extends StObject {
    
    /**
      * Specifies the POSIX group ID to apply to the `rootDirectory`.
      */
    var ownerGid: Input[Double] = js.native
    
    /**
      * Specifies the POSIX user ID to apply to the `rootDirectory`.
      */
    var ownerUid: Input[Double] = js.native
    
    /**
      * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
      */
    var permissions: Input[String] = js.native
  }
  object AccessPointRootDirectoryCreationInfo {
    
    @scala.inline
    def apply(ownerGid: Input[Double], ownerUid: Input[Double], permissions: Input[String]): AccessPointRootDirectoryCreationInfo = {
      val __obj = js.Dynamic.literal(ownerGid = ownerGid.asInstanceOf[js.Any], ownerUid = ownerUid.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointRootDirectoryCreationInfo]
    }
    
    @scala.inline
    implicit class AccessPointRootDirectoryCreationInfoMutableBuilder[Self <: AccessPointRootDirectoryCreationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwnerGid(value: Input[Double]): Self = StObject.set(x, "ownerGid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUid(value: Input[Double]): Self = StObject.set(x, "ownerUid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissions(value: Input[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileSystemLifecyclePolicy extends StObject {
    
    /**
      * Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
      */
    var transitionToIa: Input[String] = js.native
  }
  object FileSystemLifecyclePolicy {
    
    @scala.inline
    def apply(transitionToIa: Input[String]): FileSystemLifecyclePolicy = {
      val __obj = js.Dynamic.literal(transitionToIa = transitionToIa.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemLifecyclePolicy]
    }
    
    @scala.inline
    implicit class FileSystemLifecyclePolicyMutableBuilder[Self <: FileSystemLifecyclePolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransitionToIa(value: Input[String]): Self = StObject.set(x, "transitionToIa", value.asInstanceOf[js.Any])
    }
  }
}
