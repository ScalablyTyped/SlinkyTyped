package typingsSlinky.awsSdk.snowballMod

import typingsSlinky.awsSdk.configMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snowball extends Service {
  
  /**
    * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
    */
  def cancelCluster(): Request[CancelClusterResult, AWSError] = js.native
  def cancelCluster(callback: js.Function2[/* err */ AWSError, /* data */ CancelClusterResult, Unit]): Request[CancelClusterResult, AWSError] = js.native
  /**
    * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
    */
  def cancelCluster(params: CancelClusterRequest): Request[CancelClusterResult, AWSError] = js.native
  def cancelCluster(
    params: CancelClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelClusterResult, Unit]
  ): Request[CancelClusterResult, AWSError] = js.native
  
  /**
    * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
    */
  def cancelJob(): Request[CancelJobResult, AWSError] = js.native
  def cancelJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResult, Unit]): Request[CancelJobResult, AWSError] = js.native
  /**
    * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
    */
  def cancelJob(params: CancelJobRequest): Request[CancelJobResult, AWSError] = js.native
  def cancelJob(
    params: CancelJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResult, Unit]
  ): Request[CancelJobResult, AWSError] = js.native
  
  @JSName("config")
  var config_Snowball: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
    */
  def createAddress(): Request[CreateAddressResult, AWSError] = js.native
  def createAddress(callback: js.Function2[/* err */ AWSError, /* data */ CreateAddressResult, Unit]): Request[CreateAddressResult, AWSError] = js.native
  /**
    * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
    */
  def createAddress(params: CreateAddressRequest): Request[CreateAddressResult, AWSError] = js.native
  def createAddress(
    params: CreateAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAddressResult, Unit]
  ): Request[CreateAddressResult, AWSError] = js.native
  
  /**
    * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
    */
  def createCluster(): Request[CreateClusterResult, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResult, Unit]): Request[CreateClusterResult, AWSError] = js.native
  /**
    * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
    */
  def createCluster(params: CreateClusterRequest): Request[CreateClusterResult, AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResult, Unit]
  ): Request[CreateClusterResult, AWSError] = js.native
  
  /**
    * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
    */
  def createJob(): Request[CreateJobResult, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]): Request[CreateJobResult, AWSError] = js.native
  /**
    * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResult, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]
  ): Request[CreateJobResult, AWSError] = js.native
  
  /**
    * Takes an AddressId and returns specific details about that address in the form of an Address object.
    */
  def describeAddress(): Request[DescribeAddressResult, AWSError] = js.native
  def describeAddress(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAddressResult, Unit]): Request[DescribeAddressResult, AWSError] = js.native
  /**
    * Takes an AddressId and returns specific details about that address in the form of an Address object.
    */
  def describeAddress(params: DescribeAddressRequest): Request[DescribeAddressResult, AWSError] = js.native
  def describeAddress(
    params: DescribeAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAddressResult, Unit]
  ): Request[DescribeAddressResult, AWSError] = js.native
  
  /**
    * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
    */
  def describeAddresses(): Request[DescribeAddressesResult, AWSError] = js.native
  def describeAddresses(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAddressesResult, Unit]): Request[DescribeAddressesResult, AWSError] = js.native
  /**
    * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
    */
  def describeAddresses(params: DescribeAddressesRequest): Request[DescribeAddressesResult, AWSError] = js.native
  def describeAddresses(
    params: DescribeAddressesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAddressesResult, Unit]
  ): Request[DescribeAddressesResult, AWSError] = js.native
  
  /**
    * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
    */
  def describeCluster(): Request[DescribeClusterResult, AWSError] = js.native
  def describeCluster(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResult, Unit]): Request[DescribeClusterResult, AWSError] = js.native
  /**
    * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
    */
  def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResult, AWSError] = js.native
  def describeCluster(
    params: DescribeClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResult, Unit]
  ): Request[DescribeClusterResult, AWSError] = js.native
  
  /**
    * Returns information about a specific job including shipping information, job status, and other important metadata. 
    */
  def describeJob(): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]): Request[DescribeJobResult, AWSError] = js.native
  /**
    * Returns information about a specific job including shipping information, job status, and other important metadata. 
    */
  def describeJob(params: DescribeJobRequest): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]
  ): Request[DescribeJobResult, AWSError] = js.native
  
  /**
    * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
    */
  def getJobManifest(): Request[GetJobManifestResult, AWSError] = js.native
  def getJobManifest(callback: js.Function2[/* err */ AWSError, /* data */ GetJobManifestResult, Unit]): Request[GetJobManifestResult, AWSError] = js.native
  /**
    * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
    */
  def getJobManifest(params: GetJobManifestRequest): Request[GetJobManifestResult, AWSError] = js.native
  def getJobManifest(
    params: GetJobManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobManifestResult, Unit]
  ): Request[GetJobManifestResult, AWSError] = js.native
  
  /**
    * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
    */
  def getJobUnlockCode(): Request[GetJobUnlockCodeResult, AWSError] = js.native
  def getJobUnlockCode(callback: js.Function2[/* err */ AWSError, /* data */ GetJobUnlockCodeResult, Unit]): Request[GetJobUnlockCodeResult, AWSError] = js.native
  /**
    * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
    */
  def getJobUnlockCode(params: GetJobUnlockCodeRequest): Request[GetJobUnlockCodeResult, AWSError] = js.native
  def getJobUnlockCode(
    params: GetJobUnlockCodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobUnlockCodeResult, Unit]
  ): Request[GetJobUnlockCodeResult, AWSError] = js.native
  
  /**
    * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
    */
  def getSnowballUsage(): Request[GetSnowballUsageResult, AWSError] = js.native
  def getSnowballUsage(callback: js.Function2[/* err */ AWSError, /* data */ GetSnowballUsageResult, Unit]): Request[GetSnowballUsageResult, AWSError] = js.native
  /**
    * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
    */
  def getSnowballUsage(params: GetSnowballUsageRequest): Request[GetSnowballUsageResult, AWSError] = js.native
  def getSnowballUsage(
    params: GetSnowballUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSnowballUsageResult, Unit]
  ): Request[GetSnowballUsageResult, AWSError] = js.native
  
  /**
    * Returns an Amazon S3 presigned URL for an update file associated with a specified JobId.
    */
  def getSoftwareUpdates(): Request[GetSoftwareUpdatesResult, AWSError] = js.native
  def getSoftwareUpdates(callback: js.Function2[/* err */ AWSError, /* data */ GetSoftwareUpdatesResult, Unit]): Request[GetSoftwareUpdatesResult, AWSError] = js.native
  /**
    * Returns an Amazon S3 presigned URL for an update file associated with a specified JobId.
    */
  def getSoftwareUpdates(params: GetSoftwareUpdatesRequest): Request[GetSoftwareUpdatesResult, AWSError] = js.native
  def getSoftwareUpdates(
    params: GetSoftwareUpdatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSoftwareUpdatesResult, Unit]
  ): Request[GetSoftwareUpdatesResult, AWSError] = js.native
  
  /**
    * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
    */
  def listClusterJobs(): Request[ListClusterJobsResult, AWSError] = js.native
  def listClusterJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListClusterJobsResult, Unit]): Request[ListClusterJobsResult, AWSError] = js.native
  /**
    * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
    */
  def listClusterJobs(params: ListClusterJobsRequest): Request[ListClusterJobsResult, AWSError] = js.native
  def listClusterJobs(
    params: ListClusterJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClusterJobsResult, Unit]
  ): Request[ListClusterJobsResult, AWSError] = js.native
  
  /**
    * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
    */
  def listClusters(): Request[ListClustersResult, AWSError] = js.native
  def listClusters(callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResult, Unit]): Request[ListClustersResult, AWSError] = js.native
  /**
    * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
    */
  def listClusters(params: ListClustersRequest): Request[ListClustersResult, AWSError] = js.native
  def listClusters(
    params: ListClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResult, Unit]
  ): Request[ListClustersResult, AWSError] = js.native
  
  /**
    * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
    */
  def listCompatibleImages(): Request[ListCompatibleImagesResult, AWSError] = js.native
  def listCompatibleImages(callback: js.Function2[/* err */ AWSError, /* data */ ListCompatibleImagesResult, Unit]): Request[ListCompatibleImagesResult, AWSError] = js.native
  /**
    * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
    */
  def listCompatibleImages(params: ListCompatibleImagesRequest): Request[ListCompatibleImagesResult, AWSError] = js.native
  def listCompatibleImages(
    params: ListCompatibleImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCompatibleImagesResult, Unit]
  ): Request[ListCompatibleImagesResult, AWSError] = js.native
  
  /**
    * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
    */
  def listJobs(): Request[ListJobsResult, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]): Request[ListJobsResult, AWSError] = js.native
  /**
    * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResult, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]
  ): Request[ListJobsResult, AWSError] = js.native
  
  /**
    * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
    */
  def updateCluster(): Request[UpdateClusterResult, AWSError] = js.native
  def updateCluster(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterResult, Unit]): Request[UpdateClusterResult, AWSError] = js.native
  /**
    * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
    */
  def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResult, AWSError] = js.native
  def updateCluster(
    params: UpdateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterResult, Unit]
  ): Request[UpdateClusterResult, AWSError] = js.native
  
  /**
    * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
    */
  def updateJob(): Request[UpdateJobResult, AWSError] = js.native
  def updateJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobResult, Unit]): Request[UpdateJobResult, AWSError] = js.native
  /**
    * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
    */
  def updateJob(params: UpdateJobRequest): Request[UpdateJobResult, AWSError] = js.native
  def updateJob(
    params: UpdateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobResult, Unit]
  ): Request[UpdateJobResult, AWSError] = js.native
}
