organization := "org.scalablytyped.slinky"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-db8087"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-182ff7",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-3bc923",
  "org.scalablytyped.slinky" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-a53bdf",
  "org.scalablytyped.slinky" %%% "aws-sdk__types" % "0.1.0-preview.1-9499ed",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
