organization := "org.scalablytyped.slinky"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-8cc94c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-eaf965",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-a66d83",
  "org.scalablytyped.slinky" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-573873",
  "org.scalablytyped.slinky" %%% "aws-sdk__types" % "0.1.0-preview.1-d5bd20",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
