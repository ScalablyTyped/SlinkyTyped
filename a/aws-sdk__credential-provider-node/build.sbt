organization := "org.scalablytyped.slinky"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-b7aa58"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-804ad1",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-55eb90",
  "org.scalablytyped.slinky" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-2f38a9",
  "org.scalablytyped.slinky" %%% "aws-sdk__types" % "0.1.0-preview.1-5f199a",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
