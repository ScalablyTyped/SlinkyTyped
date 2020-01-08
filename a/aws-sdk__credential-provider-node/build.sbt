organization := "org.scalablytyped.slinky"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-e5b6b7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-a65a2d",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-2ef5f4",
  "org.scalablytyped.slinky" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-c7a185",
  "org.scalablytyped.slinky" %%% "aws-sdk__types" % "0.1.0-preview.1-0528f0",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        